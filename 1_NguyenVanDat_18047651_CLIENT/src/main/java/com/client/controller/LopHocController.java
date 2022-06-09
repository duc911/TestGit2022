package com.client.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.client.model.LopHoc;
import com.client.service.LopHocService;

@Controller
public class LopHocController {

	@Autowired
	private LopHocService lopHocService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)         
	public String view(HttpServletRequest request ) {//  cho nay chon HttpServletRequest chon HttpRequest rot mon :)) khoi than
		List<LopHoc> list = lopHocService.getAll();
		request.setAttribute("list", list);
		
		return "view";
		
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)         
	public String add(HttpServletRequest request ) {
		return "add";
		
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)         
	public String add(@ModelAttribute LopHoc lopHoc) {
		
		lopHocService.save(lopHoc);
		return "redirect:/list";
		
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)         
	public String add(HttpServletRequest request , @PathVariable(name="id") int id) {
		
		LopHoc lopHoc  = lopHocService.getbyId(id);
		request.setAttribute("lp", lopHoc);
		return "update";
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)         
	public String update(@ModelAttribute LopHoc lopHoc) {
		lopHocService.save(lopHoc);
		return "redirect:/list";
		
	}
	
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)         
	public String add(@PathVariable(name="id") int id) {	
		lopHocService.delete(id);
		return "redirect:/list";
		
	}
}
