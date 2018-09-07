package com.liguangping.restfuldemo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ranger Tsao(https://github.com/boliza)
 */
@Controller
public class TemplateController {

    @GetMapping(path = "/index")
    public String sample() {
        return "sample-crud";
    }

}
