package com.rest.service;

import java.util.List;

import com.rest.entity.LopHoc;

public interface LopHocService {
	 public List<LopHoc> getAll();
	  
	  public void add(LopHoc lopHoc);
	  
	  public void update(LopHoc lopHoc);
	  
	  public void delete(int id);
	  
	  public LopHoc getbyId(int id);
}
