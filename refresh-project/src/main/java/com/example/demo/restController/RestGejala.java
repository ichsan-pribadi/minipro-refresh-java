package com.example.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceGejala;
import com.example.demo.service.ServicePasien;

@RestController
@RequestMapping(path = "/api/gejala", produces = "application/json")
@CrossOrigin(origins = "*")
public class RestGejala {
	
	@Autowired
	private ServiceGejala SG;
	
	@GetMapping("/findlist")
	public ResponseEntity<?> findlist() {
		
		return new ResponseEntity<>(SG.findlist(), HttpStatus.OK);
	}


}
