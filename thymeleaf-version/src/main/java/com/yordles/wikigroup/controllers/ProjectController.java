package com.yordles.wikigroup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller is used to serve the project page.
 * 
 * The @Controller annotation tells Spring that this class is a controller.
 * The @RequestMapping annotation tells Spring that this controller will handle
 * all requests that come in at the /project path.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

    /*
     * The @GetMapping annotation tells Spring that this method will handle all GET
     * requests that come in at the /project path.
     */
    @RequestMapping()
    public String projectPage() {
        return "project";
    }
}
