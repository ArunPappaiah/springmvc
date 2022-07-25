package com.chainsys.springmvc.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")
public class Appointment {
	@Id
	private int appoint_id;
	private Date appoint_date;
	private int doctor_id;
	private String patient_name;
	private int fees_collected;
	public String getPatient_name() {
		return patient_name;
	}

	public int getId() {
		return appoint_id;
	}

	public void setId(int appoint_id) {
		this.appoint_id = appoint_id;
	}

	public Date getAppoint_date() {
		return appoint_date;
	}

	public void setAppoint_date(Date appoint_date) {
		this.appoint_date = appoint_date;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public int getFees_collected() {
		return fees_collected;
	}

	public void setFees_collected(int i) {
		this.fees_collected = i;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

  
}