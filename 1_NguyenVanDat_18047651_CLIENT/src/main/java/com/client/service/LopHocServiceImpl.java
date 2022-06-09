package com.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.client.model.LopHoc;

@Service
public class LopHocServiceImpl implements LopHocService {
	@Autowired
	private RestTemplate restTemplate;

	private String newurl;

	@Autowired
	public LopHocServiceImpl(RestTemplate Template, @Value("${url}") String url) {
		restTemplate = Template;
		newurl = url;
	}

	public List<LopHoc> getAll() {

		ResponseEntity<List<LopHoc>> response = restTemplate.exchange(newurl, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<LopHoc>>() {
				});
		List<LopHoc> list = response.getBody();
		return list;

	}

	public void save(LopHoc lopHoc) {
		int lopHocId = lopHoc.getId();
    	if (lopHocId == 0 ) {
    		restTemplate.postForEntity(newurl, lopHoc, String.class);
    		
    	}else {
    		restTemplate.put(newurl, lopHoc);
    	}
	}

	public void delete(int id) {
		restTemplate.delete(newurl + "/" + id);

	}

	public LopHoc getbyId(int id) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject(newurl + "/" + id, LopHoc.class);
	}

}
