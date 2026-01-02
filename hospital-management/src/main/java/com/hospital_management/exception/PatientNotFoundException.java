package com.hospital_management.exception;

public class PatientNotFoundException extends HospitalException {

    public PatientNotFoundException(String id) {
        super("Patient not found with id: " + id);
    }
}
