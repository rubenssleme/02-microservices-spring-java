package com.rubensleme.hrworker.repositories;

import com.rubensleme.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;



public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
