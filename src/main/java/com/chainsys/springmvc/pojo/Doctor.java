package com.chainsys.springmvc.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	private int doctor_Id;
	private String name;
	private Date dob;
	private String speciality;
	private String city;
	private long phone_number;
	@Column(name="std_fees")
	private float std_fees;

	/**
	 * @return the doctor_Id
	 */
	public int getDoctor_Id() {
		return doctor_Id;
	}
	/**
	 * @param doctor_Id the doctor_Id to set
	 */
	public void setDoctor_Id(int doctor_Id) {
		this.doctor_Id = doctor_Id;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone_number
	 */
	public long getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	/**
	 * @return the std_fees
	 */
	public float getStd_fees() {
		return std_fees;
	}
	/**
	 * @param std_fees the std_fees to set
	 */
	public void setStd_fees(float std_fees) {
		this.std_fees = std_fees;
	}
	
	
}
