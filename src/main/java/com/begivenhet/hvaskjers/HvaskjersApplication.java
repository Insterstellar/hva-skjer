package com.begivenhet.hvaskjers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HvaskjersApplication {

	public static void main(String[] args) {
		SpringApplication.run(HvaskjersApplication.class, args);
	}

	@RequestMapping("/weclome")
	public String welcome(){
		return "<h1>Welcome message</h1>";
	}

}
