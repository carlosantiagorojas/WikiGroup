package com.yordles.wikigroup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller is used to serve the home page.
 * 
 * The @Controller annotation tells Spring that this class is a controller.
 * The @RequestMapping annotation tells Spring that this controller will handle
 * all requests that come in at the /about-us path.
 */
@Controller
@RequestMapping("/about-us")
public class AboutUsController {

	/*
	 * The @GetMapping annotation tells Spring that this method will handle all GET
	 * requests that come in at the /about-us path.
	 */
	@GetMapping()
	public String aboutUsPage() {
		return "about-us";
	}

}
