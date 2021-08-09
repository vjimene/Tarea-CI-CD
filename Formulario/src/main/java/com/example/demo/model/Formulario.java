package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="formulario_ds")
public class Formulario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String fSurname;
	private String sSurname;
	private String birthday;
	private String email;
	private String rut;
	private String phone;
	private String club;
	private String address;
	private String cPhone;
	private String webPage;
		
	public Formulario() {
	}

	public Formulario(int id, String name, String pSurname, String mSurname, String birthday, String email, String rut, 
			String phone, String club, String address, String cPhone, String webPage) {
		super();
		this.id = id;
		this.name = name;
		this.fSurname = pSurname;
		this.sSurname = mSurname;
		this.birthday = birthday;
		this.email = email;
		this.rut = rut;
		this.phone = phone;
		this.club = club;
		this.address = address;
		this.cPhone = cPhone;
		this.webPage = webPage;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getfSurname() {
		return fSurname;
	}

	public void setfSurname(String pSurname) {
		this.fSurname = pSurname;
	}

	public String getsSurname() {
		return sSurname;
	}

	public void setsSurname(String mSurname) {
		this.sSurname = mSurname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getcPhone() {
		return cPhone;
	}

	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}

	public String getWebPage() {
		return webPage;
	}

	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}
}
	