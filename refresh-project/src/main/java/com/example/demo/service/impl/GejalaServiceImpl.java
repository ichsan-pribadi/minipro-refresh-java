package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ModelGejala;
import com.example.demo.models.dto.listDto;
import com.example.demo.repositories.RepoGejala;
import com.example.demo.service.ServiceGejala;

@Service
public class GejalaServiceImpl implements ServiceGejala{

	@Autowired
	private RepoGejala RG;
	
	@Override
	public List<listDto> findlist() {
		// TODO Auto-generated method stub
		return RG.findlist();
	}

	@Override
	public ModelGejala save(ModelGejala modelgejala) {
		// TODO Auto-generated method stub
		return null;
	}

}
