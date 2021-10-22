package com.assessment.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.boot.model.LocationInfo;
import com.assessment.boot.repository.LocationInfoRepository;

@SpringBootApplication
@RestController
public class WisestepAssessmentElasticApplication {

	@Autowired
	private LocationInfoRepository repository;
	
	@PostMapping("/saveLocation")
	public void saveLocation(LocationInfo location) {
		repository.save(location);
	}
	
	@GetMapping("/readAll")
	public Iterable<LocationInfo> readAll(){
		return repository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WisestepAssessmentElasticApplication.class, args);
	}

}
