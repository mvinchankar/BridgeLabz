package com.bridgelabz.model;

public class Doctor
{
	private String doctorId;
	private String doctorName;
	private String doctoravailibility;
	private String doctorSpecialization;
	int amCount=0;
	int pmCount=0;
	
	public int getAmCount() {
		return amCount;
	}

	public void setAmCount(int amCount) {
		this.amCount = amCount;
	}

	
	public int getPmCount() {
		return pmCount;
	}

	public void setPmCount(int pmCount) {
		this.pmCount = pmCount;
	}

	public Doctor()
	{
		
	}
	public Doctor(String doctroId,String doctorName,String doctoravailibility,String doctorSpecialization)
	{
		this.doctorId=doctroId;
		this.doctorName=doctorName;
		this.doctoravailibility=doctoravailibility;
		this.doctorSpecialization=doctorSpecialization;
		this.amCount=amCount;
		this.pmCount=pmCount;
	}
	public String getDoctorId() 
	{
		return doctorId;
	}
	public void setDoctorId(String doctorId) 
	{
		this.doctorId = doctorId;
	}
	public String getDoctorName() 
	{
		return doctorName;
	}
	public void setDoctorName(String doctorName) 
	{
		this.doctorName = doctorName;
	}
	public String getDoctorAvailibility()
	{
		return doctoravailibility;
	}
	public void setDoctorAvailibility(String doctoravailibility) 
	{
		this.doctoravailibility = doctoravailibility;
	}
	public String getDoctorSpecialization() 
	{
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) 
	{
		this.doctorSpecialization = doctorSpecialization;
	}
	
}