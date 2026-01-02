package com.hospital_management.exception;

public class DoctorUnavailableException extends HospitalException {

    public DoctorUnavailableException(String id) {
        super("Doctor is currently unavailable. Doctor id: " + id);
    }
}
