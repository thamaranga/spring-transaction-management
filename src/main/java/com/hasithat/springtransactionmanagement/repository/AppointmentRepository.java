package com.hasithat.springtransactionmanagement.repository;

import com.hasithat.springtransactionmanagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
