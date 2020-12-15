package com.cg.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.addressbook.dto.AddressBookDTO;
import com.cg.addressbook.dto.ResponseDTO;
import com.cg.addressbook.model.PersonData;
import com.cg.addressbook.service.AddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

	@Autowired
	private AddressBookService addressBookService;
	
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<ResponseDTO> getPersonData(){
		List<PersonData> personDataList = addressBookService.getPersonData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", personDataList);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@RequestMapping("/get/{fName}")
	public ResponseEntity<ResponseDTO> getPersonData(@PathVariable("fName") String firstName){
		PersonData personData = addressBookService.getPersonByFirstName(firstName);
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful for first Name", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addPersonData(@RequestBody AddressBookDTO addressBookDTO){
		PersonData personData = addressBookService.createPersonData(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Create Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody AddressBookDTO addressBookDTO){
		PersonData personData = addressBookService.updatePersonData(addressBookDTO.getFirstName(),addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Update Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@DeleteMapping("/delete/{fName}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("fName") String firstName){
		addressBookService.deletePersonData(firstName);
		ResponseDTO respDTO = new ResponseDTO("Delete Call Successful", firstName);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}