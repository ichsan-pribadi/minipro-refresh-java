package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.jni.PasswordCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ModelGejala;
import com.example.demo.models.ModelPasien;
import com.example.demo.repositories.RepoPasien;
import com.example.demo.service.ServicePasien;

@Service
public class PaseienServiceImpl implements ServicePasien{
	
	@Autowired(required=true)
	private RepoPasien repoPasien;

	@Override
	public Optional<ModelPasien> findpasienByKode(String kode) {
		// TODO Auto-generated method stub
		return repoPasien.findpasienByKode(kode);
	}

	@Override
	public List<ModelPasien> findAllPasien() {
		// TODO Auto-generated method stub
		return repoPasien.findAllPasien();
	}

	@Override
	public ModelPasien save(ModelPasien modelpasien) {
		// TODO Auto-generated method stub
		return repoPasien.save(modelpasien);
	}


	

}
