package com.hasithat.springtransactionmanagement.repository;

import com.hasithat.springtransactionmanagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
