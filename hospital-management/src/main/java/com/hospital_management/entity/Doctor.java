package com.hospital_management.entity;

public class Doctor {

    private final String id;
    private String name;
    private String specialization;
    private boolean available;

    public Doctor(String id, String name, String specialization) {

        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public boolean isAvailable() {
        return available;
    }

    public void updateName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Doctor name cannot be blank");
        }
        this.name = name;
    }

    public void updateSpecialization(String specialization) {
        if (specialization.isBlank()) {
            throw new IllegalArgumentException("Specialization cannot be blank");
        }
        this.specialization = specialization;
    }

    public void markAvailable() {
        this.available = true;
    }

    public void markUnavailable() {
        this.available = false;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", available=" + available +
                '}';
    }

}
