package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContoller {
	
	@GetMapping("/index")
    public String viewHome(){
        return "index";
    }


}
