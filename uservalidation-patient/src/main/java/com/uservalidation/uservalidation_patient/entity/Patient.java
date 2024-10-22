package com.uservalidation.uservalidation_patient.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String patient_name;
	private String patient_mobile;
	@Column(name = "patient_username")
	private String name;
	private String patient_password;
	private String patient_place;
	private String patient_gender;
	private int patient_age;
	private int patient_weight;
	private int patient_temp;
	@Lob
	private byte[] image;

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getPatient_mobile() {
		return patient_mobile;
	}

	public void setPatient_mobile(String patient_mobile) {
		this.patient_mobile = patient_mobile;
	}

	public String getPatient_username() {
		return name;
	}

	public void setPatient_username(String patient_username) {
		this.name = patient_username;
	}

	public String getPatient_password() {
		return patient_password;
	}

	public void setPatient_password(String patient_password) {
		this.patient_password = patient_password;
	}

	public String getPatient_place() {
		return patient_place;
	}

	public void setPatient_place(String patient_place) {
		this.patient_place = patient_place;
	}

	public String getPatient_gender() {
		return patient_gender;
	}

	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}

	public int getPatient_age() {
		return patient_age;
	}

	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}

	public int getPatient_weight() {
		return patient_weight;
	}

	public void setPatient_weight(int patient_weight) {
		this.patient_weight = patient_weight;
	}

	public int getPatient_temp() {
		return patient_temp;
	}

	public void setPatient_temp(int patient_temp) {
		this.patient_temp = patient_temp;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", patient_name=" + patient_name + ", patient_mobile=" + patient_mobile
				+ ", patient_username=" + name + ", patient_password=" + patient_password
				+ ", patient_place=" + patient_place + ", patient_gender=" + patient_gender + ", patient_age="
				+ patient_age + ", patient_weight=" + patient_weight + ", patient_temp=" + patient_temp + "]";
	}
}
