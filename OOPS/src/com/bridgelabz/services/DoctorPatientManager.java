package com.bridgelabz.services;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.utility.Utility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DoctorPatientManager implements DocPatientInterface 
{

	Scanner sc = new Scanner(System.in);
	Doctor doctor = new Doctor();
	Patient patient = new Patient();
	Appointment app = new Appointment();
	ObjectMapper mapper = new ObjectMapper();
    /*
     * List of Doctor Details 
     */
	static List<Doctor> doctorlist = new ArrayList<>();
	/*
	 * List of Patient Details 
	 */
	static List<Patient> patientlist = new ArrayList<>();
	/*
	 * List of Appointments
	 */
	static List<Appointment> appointmentlist = new ArrayList<>();
	String doctId = "";
	{
		try 
		{
			/*
			 * Reads the Value from Doctor json File 
			 */
			doctorlist = mapper.readValue(
					new File("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/Doctor.json"),
					new TypeReference<List<Doctor>>() 
					{
					});
			/*
			 * Reads the Value from Patient file and Stores it into patientlist
			 */
			patientlist = mapper.readValue(
					new File("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/Patient.json"),
					new TypeReference<List<Patient>>() 
					{
					});
			/*
			 * reads the value from Appointment file and Stores it into Appointment List
			 */
			appointmentlist = mapper.readValue(new File(
					"/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/Appointment.json"),
					new TypeReference<List<Appointment>>() 
			{
			});
		} 
		catch (Exception e) 
		{

		}
	}

	/**
	 * Method to Do Operations on Doctor and Patient 
	 */
	public void operation()
	{
		int choice = 0;
		do 
		{
			System.out.println("1.Add_Doctor");
			System.out.println("2.Edit_Doctor");
			System.out.println("3.Delete_Doctor");
			System.out.println("4.Add_Patient");
			System.out.println("5.Edit_Patient");
			System.out.println("6.Delete_Patient");
			System.out.println("7.Save");
			System.out.println("8.AppointMent");
			System.out.println("9.Exit");
			choice = Utility.integerScanner();
			switch (choice) 
			{
			case 1:
				/*
				 * Method to Add the Doctor in Clinic
				 */
				addDoctor();
				break;

			case 2:
				/*
				 * Method to Edit the Details of Doctors
				 */
				editDoctor();
				break;

			case 3:
				/*
				 * Method to Delete The Doctor from Clinique
				 */
				deleteDoctor();
				break;

			case 4:
				/*
				 * Method to Add the Patient
				 */
				addPatient();
				break;

			case 5:
				/*
				 * Method to Edit the Patient Details
				 */
				editPatient();
				break;

			case 6:
				/*
				 * Method to Delete the Patients Details
				 */
				deletePatient();
				break;

			case 7:
				/*
				 * Method to Save the Operations
				 */
				save();
				break;

			case 8:
				/*
				 * Method to take Appointment of a Doctor
				 */
				appointment();
				break;

			case 9:

				System.out.println("Exiting");

				break;
			default:
				System.out.println("Wrong Choice! please enter correct choice");

			}

		} while (choice != 9);
	}

	 /**
	  * Method to Add Doctor in Clinique 
	  */
	public void addDoctor() 
	{
		try 
		{
            /*
             * Enter Doctor id
             */
			System.out.println("Enter Doctor Id");
			String doctId = sc.nextLine();
			doctor.setDoctorId(doctId);
            
			/*
			 * Enter Doctor Name 
			 */
			System.out.println("\nEnter Doctor Name");
			String doctorName1 = sc.nextLine();
			doctor.setDoctorName(doctorName1);

			/*
			 * Enter Doctor Availability
			 */
			System.out.println("Enter Time of Doctor Availability");
			String doctorAvailibity1 = sc.nextLine();
			doctor.setDoctorAvailibility(doctorAvailibity1);
            
			/*
			 *Enter Doctor Specialization 
			 */
			System.out.println("Enter Doctor in Specialization");
			String doctorSpecalization1 = sc.nextLine();
			doctor.setDoctorSpecialization(doctorSpecalization1);

			/*
			 * Add the Information in doctorlist
			 */
			Doctor temp = new Doctor(doctId, doctorName1, doctorAvailibity1, doctorSpecalization1);
			{
				doctorlist.add(temp);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		System.out.println("Records Added");

	}

	/**
	 * Method to Edit a Doctor Details
	 */
	public void editDoctor() 
	{

		System.out.println("Enter Doctor Id You Want Editied");
		String doctorId = sc.nextLine();

		for (int i = 0; i < doctorlist.size(); i++) 
		{
			Doctor temp = doctorlist.get(i);

			if (temp.getDoctorId().equals(doctorId)) 
			{
				int choice1 = 0;

				do
				{
                    /*
                     * To Edit the Doctor Details 
                     */
					System.out.println("1.DoctorId");
					System.out.println("2.Doctor Name");
					System.out.println("3.Doctor Availibility");
					System.out.println("4.Doctor specialization");
					System.out.println("5.Exit");
					choice1 = Utility.integerScanner();
					/*
					 * switch Case
					 */
					switch (choice1)
					{
					case 1:
						System.out.println("Enter Doctor Id");
						String id = sc.nextLine();
						doctorlist.get(i).setDoctorId(id);
						break;

					case 2:
						System.out.println("Enter Doctor Name");
						String name = sc.nextLine();
						doctorlist.get(i).setDoctorName(name);
						break;

					case 3:
						System.out.println("Enter Doctor Specialization");
						String available = sc.nextLine();
						doctorlist.get(i).setDoctorSpecialization(available);
						break;

					case 4:
						System.out.println("Enter Doctor Availability");
						String special = sc.nextLine();
						doctorlist.get(i).setDoctorAvailibility(special);
						break;

					case 5:
						System.out.println("Exit");
						break;
					default:
						System.out.println("Wrong choice");

					}

				} while (choice1 != 5);

			}

		}

		if (doctorlist.size() > 0)
		{
			System.out.println("Record Not Exist");
		}

	}

	/**
	 * Method to Delete Doctor
	 */
	public void deleteDoctor() 
	{
		try {
			System.out.println("Enter Doctor Id");
			String id = sc.nextLine();
			int i = 0;
			for (i = 0; i < doctorlist.size(); i++)
			{
				Doctor temp = doctorlist.get(i);
				/*
				 * if Doctor ID matches the Id that User Want To Delete Then Remove The Doctor And Its Details 
				 */
				if (temp.getDoctorId().equals(id)) 
				{
					doctorlist.remove(i);
				}
			}
			System.out.println("Record Deleted");
		} 
		catch (Exception e) 
		{
			System.out.println("User Id Not Match");
		}

	}

	/**
	 * Method to add the Patient in Clinique 
	 */
	public void addPatient()
	{
		try {
			/*
			 * Enter the Patient Details which you want to add in Clinique
			 */
			System.out.println("Enter Patient Id");
			String patientId = sc.nextLine();
			patient.setPatientId(patientId);

			System.out.println("Enter Patient Name");
			String patientName = sc.nextLine();
			patient.setPatientName(patientName);

			System.out.println("Enter Patient Age");
			String age = sc.nextLine();
			patient.setAge(age);

			System.out.println("Enter Patient Mobile Number");
			String mobno = sc.nextLine();
			patient.setMobileNo(mobno);

			/*
			 * Add the Details in Patientlist
			 */
			Patient temp = new Patient(patientName, patientId, mobno, age);
			{

				patientlist.add(temp);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		System.out.println("Records Added");

	}

	/**
	 * Method to Edit the Patient
	 */
	public void editPatient() 
	{

		System.out.println("Enter Patient Id You Want Editied");
		String patientId1 = sc.nextLine();

		for (int i = 0; i < patientlist.size(); i++) 
		{
			Patient temp = patientlist.get(i);

			if (temp.getPatientId().equals(patientId1)) 
			{
				int choice1 = 0;

				do
				{

					/*
					 * Enter the choice to which Details you want to Edit in Patient List
					 */
					System.out.println("1.PatientId");
					System.out.println("2.Patinet Name");
					System.out.println("3.Patient Age");
					System.out.println("4.Patient Mobile Number");
					System.out.println("5.Exit");
					choice1 = sc.nextInt();
					switch (choice1) 
					{
					case 1:
						/*
						 * For PatientID
						 */
						System.out.println("Enter Patient Id");
						String id = sc.nextLine();
						patientlist.get(i).setPatientId(id);
						break;

					case 2:
						/*
						 * For Patient Name
						 */
						System.out.println("Enter Patient Name");
						String name = sc.nextLine();
						patientlist.get(i).setPatientName(name);
						break;

					case 3:
						/*
						 * For Patient Age
						 */
						System.out.println("Enter Patient Age");
						String age = sc.nextLine();
						patientlist.get(i).setAge(age);

						break;

					case 4:
						/*
						 * For Patient Mobile Number
						 */
						System.out.println("Enter Mobile Number");
						String mobno = sc.nextLine();
						patientlist.get(i).setMobileNo(mobno);
						break;

					case 5:
						System.out.println("Exit");
						break;
					default:
						System.out.println("Wrong choice");

					}

				} while (choice1 != 5);

			}

		}

		if (patientlist.size() > 0) 
		{
			System.out.println("Id Not Exist");
		}

	}

	/**
	 * Method to Delete Patient from CLinique
	 */
	public void deletePatient() 
	{
		try {
			System.out.println("Enter Patient Id");
			String id = sc.nextLine();
			int count = 0;
			for (Patient patient : patientlist) 
			{
				/*
				 * If Patient id get matched with user provided id then remove the patient
				 */
				if (patient.getPatientId().equals(id)) 
				{
					patientlist.remove(count);
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Record Deleted");
	}

	/**
	 * Method to save the details in a File 
	 */
	public void save() 
	{
		try 
		{
			mapper.writeValue(
					new File("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/Doctor.json"),
					doctorlist);
			mapper.writeValue(
					new File("/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/Patient.json"),
					patientlist);
			mapper.writeValue(
					new File(
					"/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository/Appointment.json"),
					appointmentlist);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		System.out.println("Records Saved");
	}

    /**
     * Method to arrange an appointment between Doctor and Patient
     */
	public void appointment() 
	{
		/*
		 * Enter Doctor Details 
		 */
		System.out.println("Enter Doctor Id");
		String id = sc.nextLine();

		System.out.println("Enter Doctor name ");
		String dname = sc.nextLine();

		System.out.println("Enter Doctor Availability ");
		String available = sc.nextLine();

		/*
		 * Enter the patient Details 
		 */
		System.out.println("Enter Patient Id");
		String patientid = sc.nextLine();

		System.out.println("Enter patient name ");
		String pname = sc.nextLine();

		System.out.println("Enter Patient Mobile");
		String mobno = sc.nextLine();

		
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		@SuppressWarnings("unused")
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime dateTimeNow = LocalDateTime.now();
//		LocalDateTime tomorrow = dateTimeNow.plusDays(1);
		String time = dateTimeNow.toString();
		
		try 
		{
			/*
			 * filter() is a Java 8 feature of stream 
			 */
			Doctor temp = (Doctor) doctorlist.stream().filter(i -> i.getDoctorId().equals(id))
					.collect(Collectors.toList()).get(0);
			if (temp.getDoctorAvailibility().equals(available)) 
			{
				if (temp.getDoctorAvailibility().equals("am"))
				{
					if (temp.getAmCount() > 4) 
					{
						System.out.println("Appointment full");
						return;
					} else {
						for (int i = 0; i < doctorlist.size(); i++) 
						{
							if (temp.getDoctorId().equals(id))
							{
								int temp1 = doctorlist.get(i).getAmCount();
								doctorlist.get(i).setAmCount(temp1 + 1);
							}
						}
					}
				}
			} 
			else if (temp.getDoctorAvailibility().equals("pm")) 
			{
				if (temp.getAmCount() > 4)
				{
					System.out.println("Appointment full");
					return;
				} 
				else
				{
					for (int i = 0; i < doctorlist.size(); i++) 
					{
						if (temp.getDoctorId().equals(id)) 
						{
							int temp1 = doctorlist.get(i).getAmCount();
							doctorlist.get(i).setPmCount(temp1 + 1);
						}
					}
				}
			}
			System.out.println("Appointment Fixed");
			appointmentlist.add(new Appointment(id, dname, available, patientid, pname, mobno, time));
			System.out.println(appointmentlist);
		} 
		catch (Exception e) 
		{
			System.out.println("Doctor not found !!");
		}
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		
	}
}
