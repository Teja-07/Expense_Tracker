package com.example.Cricbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/expense")
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseservice;
	@PostMapping("/postdetails")
	public Expense Expensedetails(@RequestBody Expense expense) throws Exception{
		return expenseservice.findExpenseDetails(expense);
	}
	@GetMapping("getdetails")
	public Expense GetExpenseDetails(long id,String name) {
		return expenseservice.findByExpense(id,name);
	}
	@GetMapping("salaryleft")
	public long SalaryLeft(long id,String name) {
		return expenseservice.findBySalary(id,name);
	}
}
