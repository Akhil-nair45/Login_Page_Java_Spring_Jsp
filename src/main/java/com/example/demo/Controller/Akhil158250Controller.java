package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.model;
import com.example.demo.Repository.FoodRepo;




@RestController
public class Akhil158250Controller {
	@Autowired
	FoodRepo repo;
	
	@RequestMapping("home")
	public String getHome() {
	return "Hello";
	}

	@RequestMapping("/register")
	public ModelAndView registerPage() {
	return new ModelAndView("Register");
	}

	@RequestMapping("/success")
	public ModelAndView successPage() {
	return new ModelAndView("Success");
	}

	@RequestMapping(value="insert",method=RequestMethod.POST)
	public ModelAndView insert(@RequestParam("hotelname") String Hname,@RequestParam("foodname") String fname,
	@RequestParam("fcate") String Category,@RequestParam("description") String Desc,
	@RequestParam("price") double Price, @RequestParam("myfile") String Img) {
	model m = new model(0,Hname,fname,Category,Desc,Price);
	repo.save(m);
	return successPage();

	}


	}

