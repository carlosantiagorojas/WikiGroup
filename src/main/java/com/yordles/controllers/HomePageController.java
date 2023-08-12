package com.yordles.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller is used to serve the home page.
 * 
 * The @Controller annotation tells Spring that this class is a controller.
 * The @RequestMapping annotation tells Spring that this controller will handle
 * all requests that come in at the root path.
 * 
 * The @GetMapping annotation tells Spring that this method will handle all GET
 * requests that come in at the root path.
 */
@Controller
@RequestMapping("/")
public class HomePageController {

    /**
     * This method will return the home page when a GET request is made to the root
     * path.
     * 
     * @GetMapping is a shortcut for @RequestMapping(method = RequestMethod.GET).
     * 
     * 
     * @return The name of the home page template.
     */
    @GetMapping()
    public String homePage() {
        return "index.html";
    }
}
