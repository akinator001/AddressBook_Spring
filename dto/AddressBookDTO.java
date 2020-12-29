package com.cg.addressbook.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class AddressBookDTO {
	
	@NotEmpty(message="first name should not be empty")
	private String fullName;
	
	private String address;
	
	private String city;

	private String state;

	private String zip;
	
	private String phoneNumber;
	
	public AddressBookDTO(String fullName,String address,String city,String state,String zip,String phoneNumber) {
		this.fullName =fullName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	public AddressBookDTO() {

	}

	
}