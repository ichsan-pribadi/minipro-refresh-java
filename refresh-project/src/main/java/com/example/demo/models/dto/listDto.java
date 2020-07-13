package com.example.demo.models.dto;

public class listDto {
	
	private String kode;
	private String name;
	private String gejala1;
	private String gejala2;
	private String gejala3;
	
	public listDto(String kode, String name, String gejala1, String gejala2, String gejala3) {
		super();
		this.kode = kode;
		this.name = name;
		this.gejala1 = gejala1;
		this.gejala2 = gejala2;
		this.gejala3 = gejala3;
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
	
	
	
	


}
