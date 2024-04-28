package com.example.Cricbuzz;

public class ExpenseNotFoundException extends Exception{
	public ExpenseNotFoundException(String str) {
		super();
	}
	public ExpenseNotFoundException(String str,Throwable cause) {
		super(str,cause);
	}
}
