package com.bridgelabz.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.model.Person;
import com.bridgelabz.utility.Utility;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class AddressBookManagement 
{
	ObjectMapper mapper = new ObjectMapper();
	File file;
	String filePath = "/home/use/workspace/AddressBook/src/com/bridgelabz/repository/";
	Utility utility = new Utility();
    Scanner scanner = new Scanner(System.in);	
	static List<Person> arrayList=new ArrayList<Person>();
	
	public static List<Person> getList()
	{
     return arrayList;		
	}
	
    public void createNewAddressBook() throws IOException 
    {
		System.out.print("\n\t\t\t\tEnter the File Name : ");
		String fileName = scanner.next();
		file = new File(filePath + fileName + ".json");
		if (file.exists()) {
			System.out.println(
					"\n\t\tThe name " + fileName + " is already used in this location. Please use a different name.");
		} else {
			file.createNewFile();
			mapper.writeValue(file,arrayList);
			System.out.println("\n\t\t\t\tFile is Create Successfully...!");
		}
	}

	public  List<Person>  openAddressBook(String fileName) throws IOException {
		file = new File(filePath + fileName+".json");
      //  System.out.println(file);
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
					arrayList = manageOperation.add(arrayList);
					break;

				case 2:
					arrayList = manageOperation.edit(arrayList);
					break;

				case 3:
					 arrayList = manageOperation.delete(arrayList);
										
					break;

				case 4:
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

	public void save(List<Person> arrayList) throws JsonGenerationException, JsonMappingException, IOException {
		
		mapper.writeValue(new FileOutputStream(file), arrayList);

	}

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
		String fname = Utility.stringScanner();
		file =new File(filePath+fname+".json");
			
		for(File fileName : fileList)
		{
	     if(file.getName().equals(fileName.getName()))
         {
		  arrayList = utility.readJsonDataConvertIntoList(file);

          System.out.println("\n\t\t\t\tEnter the New File Name  : ");
          String newFileName=Utility.stringScanner();
          System.out.println("\n\t\t\t\tEnter the File Extension : ");
          String extension=Utility.stringScanner();
          
          file=new File(filePath+newFileName+extension);
          file.createNewFile();
          
          mapper.writeValue(new FileOutputStream(file), arrayList);
          System.out.println("File is Save As with new Name in the Directory"); 
       
         }
		}		

	}

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
		  file.delete();
		  
		  System.out.println("\n\t\t\tFile is Deleted..!");
		 }
		}
		
	}

}
