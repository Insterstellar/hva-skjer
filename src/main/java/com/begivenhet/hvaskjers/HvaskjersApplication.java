package com.begivenhet.hvaskjers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@Controller
@RequestMapping("")
public class HvaskjersApplication {

	public static void main(String[] args) {
		SpringApplication.run(HvaskjersApplication.class, args);
	}

	@RequestMapping("")
	public String welcome(){
		return "index";
	}

}
