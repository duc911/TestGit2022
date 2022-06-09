package com.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LopHoc {
     //////  ten cua class phai giong ten cua table trong co so du lieu va tat ca thuoc tinh khai bao cung vay
	
	/// Entity xai cua thu vien javax.persistence.Entity  ;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	
	private String tenLop;
	

	private String toaNha;

	private String buoiHoc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getToaNha() {
		return toaNha;
	}

	public void setToaNha(String toaNha) {
		this.toaNha = toaNha;
	}

	public String getBuoiHoc() {
		return buoiHoc;
	}

	public void setBuoiHoc(String buoiHoc) {
		this.buoiHoc = buoiHoc;
	}
	
	public LopHoc() {
		// TODO Auto-generated constructor stub
	}

}
