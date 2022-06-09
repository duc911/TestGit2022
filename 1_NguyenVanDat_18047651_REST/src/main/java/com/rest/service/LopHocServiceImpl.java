package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.LopHocDAO;
import com.rest.entity.LopHoc;

@Service
public class LopHocServiceImpl  implements LopHocService{
	@Autowired
	private LopHocDAO lopHocDAO;
	public List<LopHoc> getAll() {
		
		return lopHocDAO.getAll();
	}

	public void add(LopHoc lopHoc) {
		lopHocDAO.add(lopHoc);
	}

	public void update(LopHoc lopHoc) {
		lopHocDAO.update(lopHoc);
		
	}

	public void delete(int id) {
		lopHocDAO.delete(id);
		
	}

	public LopHoc getbyId(int id) {
		return lopHocDAO.getbyId(id);
	}

}
