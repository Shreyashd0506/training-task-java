package com.example.Task24;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid Email Format")
    @NotBlank(message = "Email is required")
    private String email;

    @Min(value = 18,message = "Age Must be 18 Or Above ")
    @Max(value = 60,message = "Age must be below 60")
    private int age;


    @ValidPhone
    @NotBlank(message = "Phone number is required")
    private String phone;

    @NotBlank
    private String password;

}
