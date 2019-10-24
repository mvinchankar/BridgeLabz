package com.bridgelabz.controller;

import com.bridgelabz.services.DisplayData;
import com.bridgelabz.services.DoctorPatientManager;
import com.bridgelabz.services.DoctorPatientSearch;
import com.bridgelabz.utility.Utility;

/**
 * Class to operate Clinic Management
 * @author use
 *
 */
public class ClinicManagement
{

	/**
	 * Driver method for Clinic Management
	 * @param args
	 */
	public static void main(String[] args)
	{
		DoctorPatientManager doctorpatient = new DoctorPatientManager();
		DisplayData data = new DisplayData();
		DoctorPatientSearch search = new DoctorPatientSearch();

		int choice = 0;
		System.out.println("----------Welcome To Clinical Managament System----------\n");

		do
		{
			System.out.println("1.Operation for Doctor Patient Appointment");
			System.out.println("2.Searching");
			System.out.println("3.Show Data");
			System.out.println("4.Exit");
			choice = Utility.integerScanner();
			/*
			 * switch Case
			 */
			switch (choice) 
			{
			case 1:
				/*
				 * Method to do multiple operations on Doctor and Patient Details 
				 */
				doctorpatient.operation();
				break;

			case 2:
				/*
				 * Method to search the Doctor and Patient by their Attributes
				 */
				search.operation();
				break;

			case 3:
				/*
				 * Method to Display the Data 
				 */
				data.operation();
				break;

			case 4:
				System.out.println("Exited");

				break;
			default:
				System.out.println("Please Enter Correct Choice");
			}
		} while (choice != 4);
		System.out.println("Thank you!");
	}
}