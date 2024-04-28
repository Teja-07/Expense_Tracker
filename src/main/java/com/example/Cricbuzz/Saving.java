package com.example.Cricbuzz;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Saving")
public class Saving {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long savingId;
	    
	   
	    private long land_purchase;

	    
	    private long health_insurance;

	   
	    private long kids_education;

	    // Getter and setter for savingId
	    public long getSavingId() {
	        return savingId;
	    }

	    public void setSavingId(long savingId) {
	        this.savingId = savingId;
	    }
	public long getLand_purchase() {
		return land_purchase;
	}
	public void setLand_purchase(long land_purchase) {
		this.land_purchase = land_purchase;
	}
	public long getHealth_insurance() {
		return health_insurance;
	}
	public void setHealth_insurance(long health_insurance) {
		this.health_insurance = health_insurance;
	}
	public long getKids_education() {
		return kids_education;
	}
	public void setKids_education(long kids_education) {
		this.kids_education = kids_education;
	}
	@OneToOne

	@JoinColumn(name = "expense_id") // Use the correct column name referencing the expense table
	private Expense expense;
	
}
