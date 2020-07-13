package com.example.demo.models;


import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="x_pasien")
public class ModelPasien {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", length = 11)
    private Integer id;
	
	@Column(name = "kode", length =  20)
	private String kode;
	
	@Column(name = "name",length = 50)
    private String name;
	
	@Column(name = "jenis_kelamin", length = 20)
    private String jenis_kelamin;
	
	@Column(name = "tgl_lahir")
    private LocalDate tgl_lahir;
	
	@Column(name = "no_wa", length = 20)
    private String no_wa;
	
	
	@Column(name = "alamat", length = 255)
    private String alamat;




	public ModelPasien() {
		super();
	}


	public ModelPasien(String kode, String name, String jenis_kelamin, LocalDate tgl_lahir, String no_wa,
			String alamat) {
		super();
		this.kode = kode;
		this.name = name;
		this.jenis_kelamin = jenis_kelamin;
		this.tgl_lahir = tgl_lahir;
		this.no_wa = no_wa;
		this.alamat = alamat;
	}


	public String getNo_wa() {
		return no_wa;
	}


	public void setNo_wa(String no_wa) {
		this.no_wa = no_wa;
	}


	public ModelPasien(Integer id, String kode, String name, String jenis_kelamin, LocalDate tgl_lahir, String no_wa,
			String alamat) {
		super();
		this.id = id;
		this.kode = kode;
		this.name = name;
		this.jenis_kelamin = jenis_kelamin;
		this.tgl_lahir = tgl_lahir;
		this.no_wa = no_wa;
		this.alamat = alamat;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getKode() {
		return kode;
	}


	public void setKode(String kode) {
		this.kode = kode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJenis_kelamin() {
		return jenis_kelamin;
	}


	public void setJenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}


	public LocalDate getTgl_lahir() {
		return tgl_lahir;
	}


	public void setTgl_lahir(LocalDate tgl_lahir) {
		this.tgl_lahir = tgl_lahir;
	}


	public String getAlamat() {
		return alamat;
	}


	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}


	




}
