package com.mostafa.sna.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello Mostafa! Current Time On Server - "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}
	
	@GetMapping("/fortune")
	public String getDailyFourtune() {
		return "Today is your lucky day";
	}
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach Name: "+coachName+" Team Name: "+teamName;
	}
	
}
