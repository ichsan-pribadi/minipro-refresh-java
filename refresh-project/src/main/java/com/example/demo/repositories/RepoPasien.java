package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.models.ModelPasien;


public interface RepoPasien extends JpaRepository<ModelPasien, Long>{

	
	@Query("select p.kode, p.name ,p.jenis_kelamin , p.alamat "
			+ "  from ModelPasien p where p.kode=?1")
	Optional<ModelPasien> findpasienByKode(String kode);
	
	@Query("select p.id, p.kode, p.name ,p.jenis_kelamin , p.alamat "
			+ "  from ModelPasien p")
	List<ModelPasien> findAllPasien();

}
