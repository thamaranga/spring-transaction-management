package com.hasithat.springtransactionmanagement.controller;

import com.hasithat.springtransactionmanagement.dto.PatientAppointmentDetails;
import com.hasithat.springtransactionmanagement.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Booking")
public class MainController {

    @Autowired
    private MainService mainService;

    @PostMapping
    public String bookDoctor(@RequestBody PatientAppointmentDetails patientAppointmentDetails){
        return mainService.processAppointment(patientAppointmentDetails);
    }
}
