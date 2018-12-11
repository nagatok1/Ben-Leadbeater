package com.benleadbeater.database.hello.mySpringDatabaseBootApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benleadbeater.database.hello.mySpringDatabaseBootApp.exception.ResourceNotFoundException;
import com.benleadbeater.database.hello.mySpringDatabaseBootApp.model.MySpringBootDataModel;
import com.benleadbeater.database.hello.mySpringDatabaseBootApp.repository.GarageRepository;

@RestController
@RequestMapping("/api")
public class MySpringBootDataAppController {
	
	@Autowired
	GarageRepository myRepository;
	
	//Create Car
	@PostMapping("/car")
	public MySpringBootDataModel createcar(@Valid @RequestBody MySpringBootDataModel mSDM) {
		return myRepository.save(mSDM);
	}
	
	//Get Car
	@GetMapping ("car/{id}")
	public MySpringBootDataModel getcarbyID(@PathVariable(value = "id")Long carID) {
		return myRepository.findById(carID).orElseThrow(()-> new ResourceNotFoundException("MySpringBootDataModel","id",carID));
	}
	
	//Get All Cars
	@GetMapping("/car")
	public List<MySpringBootDataModel> getAllPeople(){
		return myRepository.findAll();
	}
	
	//Update a Car PUT /api/car/{carID}
	@PutMapping("/car/{id}")
	public MySpringBootDataModel updatecar(@PathVariable(value = "id") Long carID,
			@Valid @RequestBody MySpringBootDataModel carDetails) {
		
		MySpringBootDataModel mSDM = myRepository.findById(carID).orElseThrow(() -> new ResourceNotFoundException("car","id",carID));
		
		mSDM.setName(carDetails.getName());
		mSDM.setMake(carDetails.getMake());
		mSDM.setTopSpeed(carDetails.getTopSpeed());
		
		MySpringBootDataModel updateData = myRepository.save(mSDM);
		return updateData;
	}
	
	//Remove a Car
	@DeleteMapping("/car/{id}")
	public ResponseEntity<?> deletecar(@PathVariable(value = "id")Long carID){
		MySpringBootDataModel mSDM = myRepository.findById(carID).orElseThrow(()-> new ResourceNotFoundException("car","id",carID));
		
		myRepository.delete(mSDM);
		return ResponseEntity.ok().build();
	}
			

}
