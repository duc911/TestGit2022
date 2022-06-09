package com.client.service;

import java.util.List;

import com.client.model.LopHoc;

public interface LopHocService {
	 public List<LopHoc> getAll();
	
	 public void save(LopHoc lopHoc);
	  
	  public void delete(int id);
	  
	  public LopHoc getbyId(int id);
}
