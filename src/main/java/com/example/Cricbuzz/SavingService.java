package com.example.Cricbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingService {
	@Autowired
	private SavingRepo savingrepo;
	public Saving findSavingDetails(Saving saving) {
		
		return savingrepo.save(saving);
	}
	
	
}
