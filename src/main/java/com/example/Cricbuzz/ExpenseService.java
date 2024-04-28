package com.example.Cricbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepo expenseRepo;
    @Autowired
    private SavingRepo savingRepo;
    // Used to post the details
    public Expense findExpenseDetails(Expense expense) throws Exception {
        long id = expense.getId();
        String name = expense.getName();
        if (expenseRepo.findByIdAndName(id, name) == null) {
            return expenseRepo.save(expense);
        } else {
            throw new Exception("User ID already exists");
        }
    }

    // It is used to find the expense
    public Expense findByExpense(long id, String name) {
        return expenseRepo.findByIdAndName(id, name);
    }

    // Now can write a method to find the last salary left
    public long findBySalary(long id, String name) {
        Expense expense = expenseRepo.findByIdAndName(id, name);
        if (expense != null) {
            long salary = expense.getSalary();
            long roomRent = expense.getRoom_rent();
            long travelExpenses = expense.getTravelling_expenses();
            long emi = expense.getEmi();
            
            Saving saving = savingRepo.findByExpenseId(expense.getId());
            if (saving != null) {
                long landPurchase = saving.getLand_purchase();
                long healthInsurance = saving.getHealth_insurance();
                long kidsEducation = saving.getKids_education();
                System.out.println(landPurchase +"try it"+ healthInsurance + kidsEducation);
                return salary - (roomRent + travelExpenses + emi + landPurchase + healthInsurance + kidsEducation);
            } else {
                throw new RuntimeException("Saving data not found for expense ID: " + id);
            }
        } else {
            throw new RuntimeException("Expense not found for ID: " + id);
        }
    }
}
