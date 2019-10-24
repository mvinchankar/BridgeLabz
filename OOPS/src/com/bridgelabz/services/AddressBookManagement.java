package com.bridgelabz.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.model.Person;
import com.bridgelabz.utility.AddressUtility;
import com.bridgelabz.utility.Utility;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *Class contains methods like create,delete,save and saveAs.
 */
public class AddressBookManagement implements AddressBookManagementInterface
{
	ObjectMapper mapper = new ObjectMapper();
	File file;
	String filePath = "/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/";
	AddressUtility utility = new AddressUtility();
    Scanner scanner = new Scanner(System.in);	
	static List<Person> arrayList=new ArrayList<Person>();
	
	/**
	 * Method to Get the List of Person
	 * @return
	 */
	public static List<Person> getList()
	{
     return arrayList;		
	}
	
	/**
	 * Method To Create a New AddressBook
	 * @throws IOException
	 */
    public void createNewAddressBook() throws IOException 
    {
		System.out.print("\n\t\t\t\tEnter the File Name : ");
		String fileName = scanner.next();
		file = new File(filePath + fileName + ".json");
		/*
		 * If file exists It will display message
		 * or It will create file by that Name 
		 */
		if (file.exists()) {
			System.out.println(
					"\n\t\tThe name " + fileName + " is already used in this location. Please use a different name.");
		} 
		else {
			file.createNewFile();
			/*
			 * It writes the File Name into the location
			 */
			mapper.writeValue(file,arrayList);
			System.out.println("\n\t\t\t\tFile is Create Successfully...!");
		}
	}

    /**
     * Method to Open the AddressBook 
     * @throws IOException
     */
	public  List<Person>  openAddressBook(String fileName) throws IOException {
		file = new File(filePath + fileName+".json");
      //  System.out.println(file);
		/*
		 * If it exists Buffer Reader read the data from File and Display iton Console
		 * or Else it is Empty
		 */
		if (file.exists()) {
			
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
			if(br.readLine()!=null)
			{
			 arrayList = utility.readJsonDataConvertIntoList(file);
             System.out.println("\nList : "+arrayList);
			}
			else
			{
			 System.out.println("File is Empty");	
			}
			
			br.close();
			/*
			 * Class in which Multiple methods are present like add,delete,edit and Sort.
			 */
			AddressBook manageOperation = new AddressBook();

			char input = ' ';
			do {

				System.out.print("\n\t\t\t\t    A D D_I N F O-S Y S T E M ");
				System.out.print("\n\t\t\t\t--------------------------------");

				System.out.print("\n\t\t\t\t  Add    Adress Book : Enter 1");
				System.out.print("\n\t\t\t\t  Edit   Adress Book : Enter 2");
				System.out.print("\n\t\t\t\t  Delete Adress Book : Enter 3");
				System.out.print("\n\t\t\t\t  Sort   Adress Book : Enter 4");

				System.out.print("\n\t\t\t\t--------------------------------\n");

				System.out.print("\n\t\t\t\tEnter Choice : ");
				int choice = Utility.integerScanner();
                 
				switch (choice) {
				case 1:
	                /*
	                 * Method to add data in a File 
	                 */
					arrayList = manageOperation.add(arrayList);
					break;

				case 2:
					/*
					 * Method to edit data in a file 
					 */
					arrayList = manageOperation.edit(arrayList);
					break;

				case 3:
					/*
					 * Method to delete data from a file
					 */
					 arrayList = manageOperation.delete(arrayList);
										
					break;

				case 4:
					/*
					 * Method to Sort the data from a file
					 */
					arrayList=manageOperation.sort(arrayList);
					break;

				default:
					System.out.println("\n\t\t\t\tInvalid Choice...!");
				}
				System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
				input = scanner.next().charAt(0);
			} while (input == 'Y' || input == 'y');

		} else {
			System.out.println("\n\t\tFile is Not Found in this loction So Please Check Your File Name Correctly...!");
		}
		return arrayList;
		 
	}

    /**
     * Method to save the changes made in AddressBook 
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonMappingException
     */
	public void save(List<Person> arrayList) throws JsonGenerationException, JsonMappingException, IOException {
		/*
		 * Mapper writes the data in a particular file from a class
		 */
		mapper.writeValue(new FileOutputStream(file), arrayList);

	}

	/**
	 * Method to rename a particular file 
	 * @throws IOException 
	 */
	public void saveAs() throws IOException {
		System.out.println();
		file = new File(filePath);
		File[] fileList = file.listFiles();
		System.out.println("\t\t\t\t	 LIST_OF_FILE");
		System.out.println("\t\t\t\t-----------------------------");
		System.out.println("\t\t\t\tDisplay_FileName | File_Size");

		for (File fileName : fileList) {

			System.out.printf("  ", fileName.getName(), fileName.length());
			System.out.println();
		}
		System.out.print("\n\t\tEnter the File Name Which You want to Save As :");
		/*
		 * Enter the file name to rename 
		 */
		String fname = Utility.stringScanner();
		file =new File(filePath+fname+".json");
			
		for(File fileName : fileList)
		{
		 /*
		  * If file name matches then Change the name of a file
		  */
	     if(file.getName().equals(fileName.getName()))
         {
		  arrayList = utility.readJsonDataConvertIntoList(file);

          System.out.println("\n\t\t\t\tEnter the New File Name  : ");
          String newFileName=Utility.stringScanner();
          System.out.println("\n\t\t\t\tEnter the File Extension : ");
          String extension=Utility.stringScanner();
          
          file=new File(filePath+newFileName+extension);
          /*
           * Method to create a new file
           */
          file.createNewFile();
          /*
           * Mapper writes the data into file
           */
          mapper.writeValue(new FileOutputStream(file), arrayList);
          System.out.println("File is Save As with new Name in the Directory"); 
       
         }
	     else
	     {
	    	 System.out.println("Incorrect Details");
	     }
		}		

	}
    
	/**
	 * Method to Delete a Particular AddressBook File 
	 * @throws IOException
     * @throws JsonMappingException
     * @throws JsonMappingException
	 */
	public void deleteFile() throws JsonGenerationException, JsonMappingException, IOException 
	{
		file = new File(filePath);
		File[] fileList = file.listFiles();
		System.out.println("\t\t\t\t	 LIST_OF_FILE");
		System.out.println("\t\t\t\t-----------------------------");
		System.out.println("\t\t\t\tDisplay_FileName | File_Size");

		for (File fileName : fileList) {

			System.out.printf(" ", fileName.getName(), fileName.length());
			System.out.println();
		}

		System.out.print("\n\t\t\tEnter the File Name Which you want to Delete :");
		String fname = utility.stringScanner();
		file =new File(filePath+fname+".json");
			
		for(File fileName : fileList)
		{
		 if(file.getName().equals(fileName.getName()))
		 {
		  /*
		   * file.delete is a method to delete a method 	 
		   */
		  file.delete();
		  
		  System.out.println("\n\t\t\tFile is Deleted..!");
		 }
		}
		
	}

}
