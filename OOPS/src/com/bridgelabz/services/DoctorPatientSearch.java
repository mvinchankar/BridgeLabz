package com.bridgelabz.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.utility.Utility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DoctorPatientSearch implements Searching 
{

	ObjectMapper mapper = new ObjectMapper();
	Scanner scanner = new Scanner(System.in);

	static List<Doctor> doctorlist = new ArrayList<>();
	static List<Patient> patientlist = new ArrayList<>();

	String doctId = "";
	{
		try 
		{
			doctorlist = mapper.readValue(
					new File("/home/use/workspace/OOPS/src/com/bridgelabz/repository/Doctor.json"),
					new TypeReference<List<Doctor>>() 
					{
					});
			patientlist = mapper.readValue(
					new File("/home/use/workspace/OOPS/src/com/bridgelabz/repository/Patient.json"),
					new TypeReference<List<Patient>>()
					{
					});
		} 
		catch (Exception e)
		{
		}
	}

	public void operation() 
	{
		int choice = 0;
		do 
		{
			System.out.println("********Search Doctor********");
			System.out.println();
			System.out.println("1.Search Doctor By ID");
			System.out.println("2.Search Doctor By Name");
			System.out.println("3.Search Doctor By Availability");
			System.out.println("4.Search Doctor By Specialization");
			System.out.println();
			System.out.println("********Search Patient********");
			System.out.println();
			System.out.println("5.Search Patient By ID");
			System.out.println("6.Search Patient By Name");
			System.out.println("7.Search Patient By Age");
			System.out.println("8.Search Patient By Mobile Number");
			System.out.println("9.Exit");
			choice = Utility.integerScanner();
			switch (choice)
			{
			case 1:
				searchDoctorById();
				break;
			case 2:
				searchDoctorByName();
				break;
			case 3:
				searchDoctorByAvaliability();
				break;
			case 4:
				searchDoctorBySpecilization();
				break;

			case 5:
				searchpatientByID();
				break;

			case 6:
				searchpatientByName();
				break;

			case 7:
				searchpatientByAge();
				break;

			case 8:
				searchpatientByMobileNo();
				break;

			case 9:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Wrong Choice");

			}

		} while (choice != 9);
	}

	public void searchDoctorById() 
	{
		

		System.out.println("Enter Doctor id");
		String id = scanner.nextLine();
		try {

			List<Doctor> listsearch = (List<Doctor>) doctorlist.stream().filter(i -> i.getDoctorId().equals(id))
					.collect(Collectors.toList());
			System.out.println("ID       Name            Availability            Specialization");
			for (int i = 0; i < listsearch.size(); i++) 
			{
				System.out.println(listsearch.get(i).getDoctorId() + "  " + listsearch.get(i).getDoctorName()
						+ "       " + listsearch.get(i).getDoctorAvailibility() + "       "
						+ listsearch.get(i).getDoctorSpecialization());
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Wrong Id");
		}
	}

	public void searchDoctorByName() 
	{
		System.out.println("Enter Doctor Name");
		String name = scanner.nextLine();
		try 
		{

			List<Doctor> listsearch = (List<Doctor>) doctorlist.stream().filter(i -> i.getDoctorName().equals(name))
					.collect(Collectors.toList());
			System.out.println("ID\tName\t\tAvailability\t\tSpecialization");
			for (int i = 0; i < listsearch.size(); i++) 
			{
				System.out.println(listsearch.get(i).getDoctorId() + "\t" + listsearch.get(i).getDoctorName()
						+ "\t\t" + listsearch.get(i).getDoctorAvailibility() + "\t\t"
						+ listsearch.get(i).getDoctorSpecialization());
			}

		} 
		catch (Exception e) 
		{
			System.out.println("Wrong Name");
		}

	}

	
	public void searchDoctorBySpecilization()
	{
		// TODO Auto-generated method stub

		System.out.println("Enter Doctor Specialization");
		String specialization = scanner.nextLine();
		try 
		{

			List<Doctor> listsearch = (List<Doctor>) doctorlist.stream()
					.filter(i -> i.getDoctorSpecialization().equals(specialization)).collect(Collectors.toList());
			System.out.println("ID\tName\t\tAvailability\t\tSpecialization");
			for (int i = 0; i < listsearch.size(); i++) 
			{
				System.out.println(listsearch.get(i).getDoctorId() + "\t" + listsearch.get(i).getDoctorName()
						+ "\t\t" + listsearch.get(i).getDoctorAvailibility() + "\t\t"
						+ listsearch.get(i).getDoctorSpecialization());
			}

		}
		catch (Exception e) 
		{
			System.out.println("Wrong specialization");
		}

	}

	
	public void searchDoctorByAvaliability() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter Doctor  Availability  ");
		String availability = scanner.nextLine();
		try 
		{

			List<Doctor> listsearch = (List<Doctor>) doctorlist.stream()
					.filter(i -> i.getDoctorAvailibility().equals(availability)).collect(Collectors.toList());
			System.out.println("ID\tName\t\tAvailability\t\tSpecialization");
			for (int i = 0; i < listsearch.size(); i++)
			{
				System.out.println(listsearch.get(i).getDoctorId() + "\t" + listsearch.get(i).getDoctorName()
						+ "\t\t" + listsearch.get(i).getDoctorAvailibility() + "\t\t"
						+ listsearch.get(i).getDoctorSpecialization());
			}

		}
		catch (Exception e) 
		{
			System.out.println("Wrong availability");
		}
	}


	public void searchpatientByID() 
	{
		// TODO Auto-generated method stub

		System.out.println("Enter Patient Id  ");
		String id = scanner.nextLine();
		try 
		{

			List<Patient> listsearch = (List<Patient>) patientlist.stream().filter(i -> i.getPatientId().equals(id))
					.collect(Collectors.toList());
			System.out.println("ID\tName\t\tAge\tMobile Number");
			for (int i = 0; i < listsearch.size(); i++) 
			{
				System.out.println(listsearch.get(i).getPatientId() + "\t" + listsearch.get(i).getPatientName()
						+ "\t\t" + listsearch.get(i).getAge() + "\t" + listsearch.get(i).getMobileNo());
			}
		} 
		catch (Exception e)
		{
			System.out.println("Wrong ID");
		}
	}

	
	public void searchpatientByName() 
	{
		// TODO Auto-generated method stub

		System.out.println("Enter Patient Name ");
		String name = scanner.nextLine();
		try 
		{

			List<Patient> listsearch = (List<Patient>) patientlist.stream().filter(i -> i.getPatientName().equals(name))
					.collect(Collectors.toList());
			System.out.println("ID\tName\t\tAge\tMobile Number");
			for (int i = 0; i < listsearch.size(); i++)
			{
				System.out.println(listsearch.get(i).getPatientId() + "\t" + listsearch.get(i).getPatientName()
						+ "\t\t" + listsearch.get(i).getAge() + "\t" + listsearch.get(i).getMobileNo());
			}

		} 
		catch (Exception e) 
		{
			System.out.println("Wrong Name");
		}

	}

	
	public void searchpatientByAge()
	{
		// TODO Auto-generated method stub

		System.out.println("Enter Patient Age  ");
		String age = scanner.nextLine();
		try {

			List<Patient> listsearch = (List<Patient>) patientlist.stream().filter(i -> i.getAge().equals(age))
					.collect(Collectors.toList());
			System.out.println("ID\tName\t\tAge\tMobile Number");
			for (int i = 0; i < listsearch.size(); i++) 
			{
				System.out.println(listsearch.get(i).getPatientId() + "\t" + listsearch.get(i).getPatientName()
						+ "\t\t" + listsearch.get(i).getAge() + "\t" + listsearch.get(i).getMobileNo());
			}

		}
		catch (Exception e) 
		{
			System.out.println("Wrong age");
		}

	}

	
	public void searchpatientByMobileNo() 
	{
		// TODO Auto-generated method stub

		System.out.println("Enter Patient Mobile No  ");
		String mobno = scanner.nextLine();
		try {

			List<Patient> listsearch = (List<Patient>) patientlist.stream().filter(i -> i.getMobileNo().equals(mobno))
					.collect(Collectors.toList());
			System.out.println("ID\tName\t\tAge\tMobile Number");
			for (int i = 0; i < listsearch.size(); i++) 
			{
				System.out.println(listsearch.get(i).getPatientId() + "\t" + listsearch.get(i).getPatientName()
						+ "\t\t" + listsearch.get(i).getAge() + "\t" + listsearch.get(i).getMobileNo());
			}

		} 
		catch (Exception e) 
		{
			System.out.println("Wrong Mobile Number");
		}
	}
}