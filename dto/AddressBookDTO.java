package com.cg.addressbook.dto;

import lombok.Data;

@Data
public class AddressBookDTO {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	
	public AddressBookDTO(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber,String email) {
		this.firstName =firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public AddressBookDTO() {

	}

	public String toString() {
		return "first name: "+ this.firstName+", last name = "+this.lastName+", address = "+this.address+", city ="+this.city+", state = "+this.state+", zip = "+this.zip+", phone number = "+this.phoneNumber+", email = "+this.email;
	}
}