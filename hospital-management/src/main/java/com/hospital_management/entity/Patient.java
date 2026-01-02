package com.hospital_management.entity;

import java.time.LocalDate;

public class Patient {

    private final String id;
    private String name;
    private LocalDate dateOfBirth;
    private String contactNumber;
    private String address;
    private String medicalHistory;

    public Patient(String id, String name, LocalDate dateOfBirth,
                   String contactNumber, String address) {

        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.address = address;
    }


    public String getId(){ return id; }
    public String getName(){ return name; }
    public LocalDate getDateOfBirth(){ return dateOfBirth; }
    public String getContactNumber(){ return contactNumber; }
    public String getAddress(){ return address; }
    public String getMedicalHistory(){ return medicalHistory; }

  
    public void updateName(String name){
        if(name.isBlank()){
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.name = name;
    }

    public void updateAddress(String address){
        if(address.isBlank()){
            throw new IllegalArgumentException("Address cannot be blank");
        }
        this.address = address;
    }

    public void appendMedicalHistory(String newEntry){
        if(newEntry.isBlank()){
            throw new IllegalArgumentException("Entry cannot be blank");
        }
        if(this.medicalHistory == null){
            this.medicalHistory = newEntry;
        }else{
            this.medicalHistory = this.medicalHistory + "\n" + newEntry;
        }
    }

    @Override
    public String toString(){
        return id+" "+name+" "+dateOfBirth+" "+contactNumber+" "+address;
    }
}
