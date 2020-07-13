package com.example.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ModelPasien;
import com.example.demo.service.ServicePasien;

@RestController
@RequestMapping(path = "/api/pasien", produces = "application/json")
@CrossOrigin(origins = "*")
public class RestPasien {
	
	@Autowired
	private ServicePasien SP;
	
	@GetMapping("/findpasienByKode")
	public ResponseEntity<?> findpasienByKode( @RequestParam String kode) {
		return new ResponseEntity<>(SP.findpasienByKode(kode), HttpStatus.OK);
	}
	
	@GetMapping("/findAllPasien")
	public ResponseEntity<?> findAllPasien() {
		return new ResponseEntity<>(SP.findAllPasien(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> saveProduct(@RequestBody ModelPasien modelpasien) {
		return new ResponseEntity<>(SP.save(modelpasien), HttpStatus.OK);
	}





}
