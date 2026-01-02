package com.hospital_management.main;

import com.hospital_management.entity.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Patient patient = new Patient(
                "P001",
                "Shreyash Devtarase",
                LocalDate.of(2003, 6, 7),
                "9370100507",
                "Pune, Maharashtra"
        );

        Doctor doctor = new Doctor(
                "D001",
                "Dr. Mehta",
                "Cardiologist"
        );

     patient.appendMedicalHistory("Diagnosed with mild hypertension.");
     doctor.markUnavailable();
     patient.updateName("Adi");
     patient.updateAddress("Nigdi");

     doctor.updateName("Dr Aniket");
     doctor.updateSpecialization("surgeon");

        System.out.println(patient);
        System.out.println(doctor);

    }
}
