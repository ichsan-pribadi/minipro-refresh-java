package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="x_gejala")
public class ModelGejala {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", length = 11)
    private Integer id;
	
	@Column(name = "kd_pasien", length =  20)
	private String kd_pasien;
	
	@Column(name = "gejala1",length = 5)
    private String gejala1;
	
	@Column(name = "gejala2",length = 5)
    private String gejala2;
	
	@Column(name = "gejala3",length = 5)
    private String gejala3;
	
	@Column(name = "faktor1",length = 5)
    private String faktor1;
	
	@Column(name = "kota_terjangkit",length = 50)
    private String kota_terjangkit;
	
	@Column(name = "faktor2a",length = 5)
    private String faktor2a;
	
	
	@Column(name = "faktor2b",length = 5)
    private String faktor2b;
	
	@Column(name = "faktor2c",length = 5)
    private String faktor2c;
	
	@Column(name = "faktor2d",length = 5)
    private String faktor2d;
	
	


	public ModelGejala(Integer id, String kd_pasien, String gejala1, String gejala2, String gejala3, String faktor1,
			String kota_terjangkit, String faktor2a, String faktor2b, String faktor2c, String faktor2d) {
		super();
		this.id = id;
		this.kd_pasien = kd_pasien;
		this.gejala1 = gejala1;
		this.gejala2 = gejala2;
		this.gejala3 = gejala3;
		this.faktor1 = faktor1;
		this.kota_terjangkit = kota_terjangkit;
		this.faktor2a = faktor2a;
		this.faktor2b = faktor2b;
		this.faktor2c = faktor2c;
		this.faktor2d = faktor2d;
	}

	public ModelGejala(String kd_pasien, String gejala1, String gejala2, String gejala3, String faktor1,
			String kota_terjangkit, String faktor2a, String faktor2b, String faktor2c, String faktor2d) {
		super();
		this.kd_pasien = kd_pasien;
		this.gejala1 = gejala1;
		this.gejala2 = gejala2;
		this.gejala3 = gejala3;
		this.faktor1 = faktor1;
		this.kota_terjangkit = kota_terjangkit;
		this.faktor2a = faktor2a;
		this.faktor2b = faktor2b;
		this.faktor2c = faktor2c;
		this.faktor2d = faktor2d;
	}

	public ModelGejala() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKd_pasien() {
		return kd_pasien;
	}

	public void setKd_pasien(String kd_pasien) {
		this.kd_pasien = kd_pasien;
	}

	public String getGejala1() {
		return gejala1;
	}

	public void setGejala1(String gejala1) {
		this.gejala1 = gejala1;
	}

	public String getGejala2() {
		return gejala2;
	}

	public void setGejala2(String gejala2) {
		this.gejala2 = gejala2;
	}

	public String getGejala3() {
		return gejala3;
	}

	public void setGejala3(String gejala3) {
		this.gejala3 = gejala3;
	}

	public String getFaktor1() {
		return faktor1;
	}

	public void setFaktor1(String faktor1) {
		this.faktor1 = faktor1;
	}

	public String getKota_terjangkit() {
		return kota_terjangkit;
	}

	public void setKota_terjangkit(String kota_terjangkit) {
		this.kota_terjangkit = kota_terjangkit;
	}

	public String getFaktor2a() {
		return faktor2a;
	}

	public void setFaktor2a(String faktor2a) {
		this.faktor2a = faktor2a;
	}

	public String getFaktor2b() {
		return faktor2b;
	}

	public void setFaktor2b(String faktor2b) {
		this.faktor2b = faktor2b;
	}

	public String getFaktor2c() {
		return faktor2c;
	}

	public void setFaktor2c(String faktor2c) {
		this.faktor2c = faktor2c;
	}

	public String getFaktor2d() {
		return faktor2d;
	}

	public void setFaktor2d(String faktor2d) {
		this.faktor2d = faktor2d;
	}
	
	

	

}
