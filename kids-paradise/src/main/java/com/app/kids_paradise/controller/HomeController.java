package com.app.kids_paradise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping({"/"})
	public String getHomePage() {
		return "index";
	}
	
	@GetMapping("/shop")
	public String getShopPage() {
		return "shop";
	}
	
	@GetMapping("/testimonial")
	public String getTestimonialPage() {
		return "testimonial";
	}
	
	@GetMapping("/why")
	public String getWhyPage() {
		return "why";
	}
	
	@GetMapping("/contact")
	public String getContactPage() {
		return "contact";
	}
}
