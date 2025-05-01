package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Tractor;
import com.example.demo.service.TractorService;

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

}
