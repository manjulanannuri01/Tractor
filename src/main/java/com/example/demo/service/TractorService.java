package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Tractor;
import com.example.demo.repository.TractorRepository;
@Service
public class TractorService {
	
	@Autowired
	TractorRepository tractorRepository;

	public Tractor addOrUpdateTractor(Tractor tractor) {
		// TODO Auto-generated method stub
		return tractorRepository.save(tractor);
	}

	public List<Tractor> getAllTractors() {
		// TODO Auto-generated method stub
		return tractorRepository.findAll();
	}

//	public Tractor updateDeatails(Tractor tractor,Long id){
//		Optional<Tractor> existingtractor = tractorRepository.findById(id);
//        if (existingtractor.isPresent()) {
//            // Update the existing employee details
//            Tractor tractorToUpdate = existingtractor.get();
//            //tractorToUpdate.setId(tractor.getId());
//            tractorToUpdate.setBrand(tractor.getBrand());
//            // Add appropriate setters
//            tractorToUpdate.setModel(tractor.getModel());
//            tractorToUpdate.setEnginePower(tractor.getEnginePower());
//            tractorToUpdate.setTransmission(tractor.getTransmission());
//            tractorToUpdate.setFuelType(tractor.getFuelType());
//            tractorToUpdate.setPrice(tractor.getPrice());         
//            tractorToUpdate.setDescription(tractor.getDescription());
//            tractorToUpdate.setImageUrl(tractor.getImageUrl());
//            //tractorToUpdate.setAddress(employeeEntity.getAddress());
//            //tractorToUpdate.setImage(employeeEntity.getImage());
//            
//            // Save the updated employee entity
//            return tractorRepository.save(tractorToUpdate);
//        } else {
//            throw new RuntimeException("Employee not found with ID: " + id);  // Handle error appropriately
//        }
//
//	}
	
	public Tractor updateDetails(Tractor tractor, Long id) {
	    Optional<Tractor> existingTractor = tractorRepository.findById(id);
	    
	    if (existingTractor.isPresent()) {
	        Tractor tractorToUpdate = existingTractor.get();
	        
	        // Do NOT update the ID manually
	        // tractorToUpdate.setId(tractor.getId()); ← removed

	        tractorToUpdate.setBrand(tractor.getBrand());
	        tractorToUpdate.setModel(tractor.getModel());
	        tractorToUpdate.setEnginePower(tractor.getEnginePower());
	        tractorToUpdate.setTransmission(tractor.getTransmission());
	        tractorToUpdate.setFuelType(tractor.getFuelType());
	        tractorToUpdate.setPrice(tractor.getPrice());
	        tractorToUpdate.setDescription(tractor.getDescription());
	        tractorToUpdate.setImageUrl(tractor.getImageUrl());

	        return tractorRepository.save(tractorToUpdate);
	    } else {
	        // Corrected the message to refer to Tractor, not Employee
	        throw new RuntimeException("Tractor not found with ID: " + id);
	    }
	}


	public void deleteTractorById(long id) {
		// TODO Auto-generated method stub
		 tractorRepository.deleteById(id);
		 //return "successfully delete";
		 
		
	}

}
