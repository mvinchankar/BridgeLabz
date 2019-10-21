package com.bridgelabz.model;

public class Appointment 
{
	private String doctorName;
	private String doctorId;
	private String patientName;
	private String patientId;
	private String availibility;
	private String patientPhone;
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the doctorId
	 */
	public String getDoctorId() {
		return doctorId;
	}
	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}
	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the availibility
	 */
	public String getAvailibility() {
		return availibility;
	}
	/**
	 * @param availibility the availibility to set
	 */
	public void setAvailibility(String availibility) {
		this.availibility = availibility;
	}
	/**
	 * @return the currentDate
	 */
	public String getCurrentDate() {
		return currentDate;
	}
	/**
	 * @param currentDate the currentDate to set
	 */
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	/**
	 * @return the patientPhone
	 */
	public String getPatientPhone() {
		return patientPhone;
	}
	/**
	 * @param patientPhone the patientPhone to set
	 */
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}
	private String currentDate;
	
	public Appointment()
	{
		
	}
	public Appointment(String doctorName,String doctorId,String patientName,String patientId,String availibility,String patientPhone,String currentDate)
	{
		this.doctorName=doctorName;
		this.doctorId=doctorId;
		this.patientName=patientName;
		this.patientId=patientId;
		this.availibility=availibility;
		this.patientPhone=patientPhone;
		this.currentDate=currentDate;
	}
	
	
}