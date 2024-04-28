package com.example.Cricbuzz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SavingRepo extends JpaRepository<Saving,Long>{
	Saving findByExpenseId(long id);
}
