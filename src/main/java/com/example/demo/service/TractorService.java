package com.example.demo.service;

import java.util.List;

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

}
