package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>" +
				"	<li><a href='/doctor/1'>See Doctor 1 </a>" +
				"	<li><a href='/doctor/2'>See Doctor 2 </a>" +
				"	<li><a href='/doctor/3'>See Doctor 3 </a>" +
				"	<li><a href='/doctor/4'>See Doctor 4 </a>" +
				"</ul>";
	}
	@RequestMapping("/doctor/1")
	@ResponseBody
	public String d1() {
		return "William Hartnell";
	}
	@RequestMapping("/doctor/2")
	@ResponseBody
	public String d2() {
		return "Patrick Troughton";
	}
	@RequestMapping("/doctor/3")
	@ResponseBody
	public String d3() {
		return "Jon Pertwee";
	}
	@RequestMapping("/doctor/4")
	@ResponseBody
	public String d4() {
		return "Tom Baker";
	}
}
