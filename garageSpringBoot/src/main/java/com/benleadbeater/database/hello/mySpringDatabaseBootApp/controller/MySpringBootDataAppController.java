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
	
	//Create Vehicle
	@PostMapping("/vehicle")
	public MySpringBootDataModel createvehicle(@Valid @RequestBody MySpringBootDataModel mSDM) {
		return myRepository.save(mSDM);
	}
	
	//Get Vehicle
	@GetMapping ("vehicle/{id}")
	public MySpringBootDataModel getvehiclebyID(@PathVariable("id")Long id) {
		return myRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("MySpringBootDataModel","id",id));
	}
	
	//Get All Vehicles
	@GetMapping("/vehicle")
	public List<MySpringBootDataModel> getAllVehicles(){
		return myRepository.findAll();
	}

	//Update a Vehicle PUT /api/vehicle/{id}
	@PutMapping("/vehicle/{id}")
	public MySpringBootDataModel updatevehicle(@PathVariable("id") Long id, @Valid @RequestBody MySpringBootDataModel vehicleDetails) {
		
		MySpringBootDataModel mSDM = myRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("vehicle","id",id));
		
		mSDM.setType(vehicleDetails.getType());
		mSDM.setName(vehicleDetails.getName());
		mSDM.setMake(vehicleDetails.getMake());
		mSDM.setTopSpeed(vehicleDetails.getTopSpeed());
		
		MySpringBootDataModel updateData = myRepository.save(mSDM);
		return updateData;
	} 

	//Remove a Vehicle by ID
	@DeleteMapping("/vehicle/{id}")
	public ResponseEntity<?> deleteVehiclebyID(@PathVariable("id")Long id){
		MySpringBootDataModel mSDM = myRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("vehicle","id",id));
		
		myRepository.delete(mSDM);
		return ResponseEntity.ok().build();
	}

}
