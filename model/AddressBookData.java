package com.cg.addressbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.addressbook.dto.AddressBookDTO;

import lombok.Data;

@Data
@Entity
@Table(name = "addressbook")
public class AddressBookData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="full_name")
	private String fullName;

	@Column(name="address")
	private String address;

	@Column(name="city")
	private String city;

	@Column(name="state")
	private String state;

	@Column(name="zip")
	private String zip;

	@Column(name="phone")
	private String phoneNumber;

	public AddressBookData(String fullName,String address,String city,String state,String zip,String phoneNumber) {
		this.fullName =fullName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	public AddressBookData() {

	}
	
	public AddressBookData(AddressBookDTO addressBookDTO) {
		this.fullName = addressBookDTO.getFullName();
		this.address = addressBookDTO.getAddress();
		this.city = addressBookDTO.getCity();
		this.state = addressBookDTO.getState();
		this.zip = addressBookDTO.getZip();
		this.phoneNumber = addressBookDTO.getPhoneNumber();
	}
}