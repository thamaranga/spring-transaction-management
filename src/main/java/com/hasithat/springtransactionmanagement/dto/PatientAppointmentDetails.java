package com.hasithat.springtransactionmanagement.dto;

import com.hasithat.springtransactionmanagement.entity.Appointment;
import com.hasithat.springtransactionmanagement.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientAppointmentDetails {

    private Patient patient;
    private Appointment appointment;
}
