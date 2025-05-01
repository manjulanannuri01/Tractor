package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Tractor;
import com.example.demo.service.TractorService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class TractorController {
	
	@Autowired
	TractorService tractorService;
	
	@PostMapping("/postTractors")

	public Tractor addTractor (@RequestBody Tractor tractor) { 
		return tractorService.addOrUpdateTractor (tractor);

	}

	@GetMapping("/getTractors")

	public List<Tractor> getAllTractors() { 
		return tractorService.getAllTractors();
		}
	
	// Update operation
	@PutMapping("updateTractor/{id}")
    public Tractor updateTractorsById(@PathVariable long id, @RequestBody Tractor tractor) {
		return  tractorService.updateTractors(tractor,id);
    	
    }
 
    // Delete operation
	@DeleteMapping("deleteTractor/{id}")
    public String deleteTractorById(Long Id) {
    	 tractorService.deleteTractorById(Id);
    	 return "successfully delete";
	}

}
