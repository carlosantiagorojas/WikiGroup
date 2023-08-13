package com.yordles.wikigroup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller is used to serve the test page.
 * 
 * The @Controller annotation tells Spring that this class is a controller.
 * The @RequestMapping annotation tells Spring that this controller will handle
 * all requests that come in at the /test path.
 */
@Controller
@RequestMapping("/tests")
public class TestController {

    /*
     * The @GetMapping annotation tells Spring that this method will handle all GET
     * requests that come in at the /test path.
     */
    @RequestMapping()
    public String test() {
        return "tests";
    }
}
