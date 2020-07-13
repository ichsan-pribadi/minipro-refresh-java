package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.ModelPasien;

public interface ServicePasien {
	
	ModelPasien save(ModelPasien modelpasien);
	List<ModelPasien>findAllPasien();
	Optional<ModelPasien> findpasienByKode(String kode);

}
