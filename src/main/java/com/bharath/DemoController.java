package com.bharath;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class DemoController {
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		//checking the pipeline build
		return new ResponseEntity<String>("hello world",HttpStatus.OK);
	}

}
