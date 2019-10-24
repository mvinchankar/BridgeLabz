package com.bridgelabz.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class DisplayData 
{
	static ObjectMapper mapper = new ObjectMapper();
	int choice = 0;
	static List<Doctor> doctorlist = new ArrayList<>();
	static List<Patient> patientlist = new ArrayList<>();
	static List<Appointment> applist = new ArrayList<>();

	Scanner scanner = new Scanner(System.in);

	{
		try
		{
			/*
			 * Reading data from Doctor File
			 */
			doctorlist = mapper.readValue(
					new File("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/Doctor.json"),
					new TypeReference<List<Doctor>>()
					{
					});
			/*
			 * Reading data from Patient File
			 */
			patientlist = mapper.readValue(
					new File("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/Patient.json"),
					new TypeReference<List<Patient>>() 
					{
					});
			/*
			 * Reading data from Appointment File
			 */
			applist = mapper.readValue(new File(
					"/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/Appointment.json"),
					new TypeReference<List<Appointment>>()
			{
			});
		} 
		catch (Exception e) 
		{

		}
	}

	public void operation() 
	{

		do {
			System.out.println("**********Data*********");
			System.out.println("1.Doctor Data");
			System.out.println("2.Patient Data");
			System.out.println("3.Appointment");
			System.out.println("4.Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				printDoctorData(doctorlist);
				break;

			case 2:
				printPatientData(patientlist);
				break;

			case 3:
				printAppointmentData(applist);
				break;

			case 4:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Please! enter correct choice");
			}
		} while (choice != 4);
	}

	/**
	 * Method to Display Doctors Details
	 * @param list
	 */
	public void printDoctorData(List<Doctor> list)
	{
		System.out.println("\tID"
				         + "\t\tName"
				         + "\t\t\tAvailability"
				         + "\tSpecialization"
				         + "\t\tamCount"
				         + "\t\tpmCount ");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("\t"+list.get(i).getDoctorId()+"\t\t"+
		    list.get(i).getDoctorName()+"\t\t"+list.get(i).getDoctorAvailibility()+"\t\t"+
			list.get(i).getDoctorSpecialization()+"\t\t\t"+
		    list.get(i).getAmCount()+"\t\t"+list.get(i).getPmCount());
			System.out.println();
		}
		
		
	}

	/**
	 * Method to Print Patient data
	 * @param list
	 */
	public void printPatientData(List<Patient> list) 
	{
		System.out.println("ID\tName\t\tAge\tMobile Number");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i).getPatientId() + "\t" + list.get(i).getPatientName() + "\t\t"
					+ list.get(i).getAge() + "\t" + list.get(i).getMobileNo());
			System.out.println();
		}
	}

	/**
	 * Method to Print Appoinments Data
	 * @param list
	 */
	private void printAppointmentData(List<Appointment> list) 
	{
		
		System.out.println(
				"DrName"
				+ "\tDrId"
				+ "\t\tPatientName"
				+ "\tPatientId"
				+ "\tDrAvailibility"
				+ "\tPatientPhone"
				+ "\tTimeAndDate");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i).getDoctorName() + "\t" + list.get(i).getDoctorId() + "\t"
					+ list.get(i).getAvailibility() + "\t\t" + list.get(i).getPatientId() + "\t\t"
					+ list.get(i).getPatientName() + "\t\t" + list.get(i).getPatientPhone() + "\t"
					+ list.get(i).getCurrentDate());
			System.out.println();
		}
	}
}