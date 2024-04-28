package com.example.Cricbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/saving")
public class SavingController {
	@Autowired
	private SavingService savingservice;
	@PostMapping("details")
	public Saving findByServiceDetails(@RequestBody Saving saving) {
		return savingservice.findSavingDetails(saving);
	}
}
