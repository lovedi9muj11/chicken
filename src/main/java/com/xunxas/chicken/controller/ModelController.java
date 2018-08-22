package com.xunxas.chicken.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xunxas.chicken.model.Model;

@RestController
public class ModelController {
	
	@RequestMapping(value = "/getStringMethod", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getStringMethod(){
		
		return "Get xxx";
	}
	
	@RequestMapping(value = "/getObjectMethod", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Model getObjectMethod(){
		Model model = new Model();
		model.setId(1);
		model.setName("ae");
		model.setSurname("GET");
		model.setCitizenId("1111111111110");
		model.setEmail("ae@ae.ae");
		model.setBirthday(new Date());
		return model;
	}
	
	@RequestMapping(value = "/getListMethod", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Model> getListMethod(){
		List<Model> models = new ArrayList<Model>();
		Model model = new Model();
		model.setId(1);
		model.setName("ae");
		model.setSurname("GET");
		model.setCitizenId("1111111111110");
		model.setEmail("ae@ae.ae");
		model.setBirthday(new Date());
		models.add(model);
		return models;
	}
	
	@RequestMapping(value = "/postStringMethod", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String postStringMethod(){
		return "Post xxx";
	}
	
	@RequestMapping(value = "/postObjectMethod", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public Model postObjectMethod(@RequestBody Model req){
		Model model = new Model();
		model.setId(1);
		model.setName("Name : "+req.getName());
		model.setSurname("POST");
		model.setCitizenId("1111111111110");
		model.setEmail("ae@ae.ae");
		model.setBirthday(new Date());
		return model;
	}
	
	@RequestMapping(value = "/postListMethod", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public List<Model> postListMethod(@RequestBody Model req){
		List<Model> models = new ArrayList<Model>();
		Model model = new Model();
		model.setId(1);
		model.setName("Name : "+req.getName());
		model.setSurname("POST");
		model.setCitizenId("1111111111110");
		model.setEmail("ae@ae.ae");
		model.setBirthday(new Date());
		models.add(model);
		return models;
	}

}
