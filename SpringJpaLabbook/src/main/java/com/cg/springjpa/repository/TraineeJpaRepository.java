package com.cg.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cg.springjpa.entities.Trainee;

@Repository
public interface TraineeJpaRepository extends JpaRepository<Trainee,Integer> {
	@Query("select t from Trainee t where t.traineeName=:traineeName")
	Trainee findByTraineeName(String traineeName);
	
	
	

}
