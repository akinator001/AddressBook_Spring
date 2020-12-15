package com.cg.addressbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.addressbook.dto.ResponseDTO;
import com.cg.addressbook.model.PersonData;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<ResponseDTO> getPersonData(){
		PersonData personData = null;
		personData = new PersonData("Aakash","Gandhi", "61 Shanti Nagar", "Panipat", "Haryana", "132103", "8708155256", "aakashgandhi1279@gmail.com");
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@RequestMapping("/get/{fName}")
	public ResponseEntity<ResponseDTO> getPersonData(@PathVariable("fName") String firstName){
		PersonData personData = null;
		personData = new PersonData("Aakash","Gandhi", "61 Shanti Nagar", "Panipat", "Haryana", "132103", "8708155256", "aakashgandhi1279@gmail.com");
		personData.setFirstName(firstName);
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful for first Name", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addPersonData(){
		PersonData personData = null;
		personData = new PersonData("Aakash","Gandhi", "61 Shanti Nagar", "Panipat", "Haryana", "132103", "8708155256", "aakashgandhi1279@gmail.com");
		ResponseDTO respDTO = new ResponseDTO("Create Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(){
		PersonData personData = null;
		personData = new PersonData("Aakash","Gandhi", "61 Shanti Nagar", "Panipat", "Haryana", "132103", "8708155256", "aakashgandhi1279@gmail.com");
		ResponseDTO respDTO = new ResponseDTO("Update Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@DeleteMapping("/delete/{fName}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("fName") String firstName){
		PersonData personData = null;
		personData = new PersonData("Aakash","Gandhi", "61 Shanti Nagar", "Panipat", "Haryana", "132103", "8708155256", "aakashgandhi1279@gmail.com");
		ResponseDTO respDTO = new ResponseDTO("Delete Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}