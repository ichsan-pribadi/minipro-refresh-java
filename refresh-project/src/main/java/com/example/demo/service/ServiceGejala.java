package com.example.demo.service;

import java.util.List;

import com.example.demo.models.ModelGejala;
import com.example.demo.models.ModelPasien;
import com.example.demo.models.dto.listDto;

public interface ServiceGejala {
	
	 List<listDto> findlist();
	 ModelGejala save(ModelGejala modelgejala);

}
