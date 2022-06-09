package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.LopHoc;
import com.rest.service.LopHocService;

@RestController
public class LopHocController {
	
	@Autowired
	private LopHocService lopHocService;
	
	@GetMapping("/lophoc")
	public List<LopHoc> getAll() {
			List<LopHoc> list = lopHocService.getAll();
			
			return list;
	}
	
	@PostMapping("/lophoc")
	public void  add(@RequestBody LopHoc lopHoc) {
		lopHocService.add(lopHoc);
	}
	
	@PutMapping("/lophoc")
	public  void  update(@RequestBody LopHoc lopHoc) {
		
		lopHocService.update(lopHoc);
	}
	
	@DeleteMapping("/lophoc/{id}")
	public  void  delete(@PathVariable (name="id") int id){
		lopHocService.delete(id);
			
	}
	
	@GetMapping("/lophoc/{id}")
	public  LopHoc  getbyId(@PathVariable (name="id") int id){
		LopHoc lopHoc = lopHocService.getbyId(id);
		return 	lopHoc;
	}
}
