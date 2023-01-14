package com.hasithat.springtransactionmanagement.service;

import com.hasithat.springtransactionmanagement.dto.PatientAppointmentDetails;
import com.hasithat.springtransactionmanagement.entity.Appointment;
import com.hasithat.springtransactionmanagement.entity.Patient;
import com.hasithat.springtransactionmanagement.repository.AppointmentRepository;
import com.hasithat.springtransactionmanagement.repository.PatientRepository;
import com.hasithat.springtransactionmanagement.util.PromocodeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
/*Below annotation is for transaction handling.
 * If we want we can add this annotation method level also.
 * */
@Transactional
/* If we want we can specify rollbackFor and noRollbackFor Exception classes as below also.
@Transactional(rollbackFor = {NullPointerException.class, ClassNotFoundException.class }
, noRollbackFor = {ArithmeticException.class, IndexOutOfBoundsException.class })
*/

public class MainService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    public String processAppointment(PatientAppointmentDetails patientAppointmentDetails) {

        //Save Patient
        Patient patient = patientAppointmentDetails.getPatient();
        long patientId = patientRepository.save(patient).getId();

        //Save appointment
        Appointment appointment = patientAppointmentDetails.getAppointment();
        //validate user promocode
        if (appointment.getPromoCode() != null) {
            PromocodeValidator.validatePromoCode(appointment.getPromoCode());
        }

        appointment.setPatientId(patientId);

        Long appointmentNo = appointmentRepository.save(appointment).getId();
        return "Hi " + patient.getName() +
                " Your appointment booked successfully & appointment number is "
                + appointmentNo;


    }
}
