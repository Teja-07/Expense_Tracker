package com.example.Cricbuzz;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="expense")
public class Expense {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	long id;
	@Column(name="name")
	String name;
	@Column(name="salary")
	long salary;
	@Column(name="room_rent")
	int room_rent;
	@Column(name="travelling_expenses")
	int travelling_expenses;
	@Column(name="emi")
	int emi;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getRoom_rent() {
		return room_rent;
	}
	public void setRoom_rent(int room_rent) {
		this.room_rent = room_rent;
	}
	public int getTravelling_expenses() {
		return travelling_expenses;
	}
	public void setTravelling_expenses(int travelling_expenses) {
		this.travelling_expenses = travelling_expenses;
	}
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	@OneToOne(mappedBy = "expense")
    private Saving saving;
	public void setSaving(Saving saving) {
		this.saving=saving;
	}
	public Saving getSaving() {
		return saving;
	}
}
