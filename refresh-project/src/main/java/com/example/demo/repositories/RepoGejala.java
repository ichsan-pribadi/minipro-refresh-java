package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.ModelGejala;
import com.example.demo.models.dto.listDto;

public interface RepoGejala extends JpaRepository<ModelGejala, Long>{
	
	@Query("select new com.example.demo.models.dto.listDto(p.kode as kode,p.name as name," 
			+ " g.gejala1 as gejala1,g.gejala2 as gejala2,g.gejala3 as gejala2) "
			+ " from ModelGejala g left join ModelPasien p on g.kd_pasien= p.kode ")
    List<listDto> findlist();

}
