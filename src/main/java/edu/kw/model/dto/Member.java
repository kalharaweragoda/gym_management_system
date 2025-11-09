package edu.kw.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    private String id;
    private String name;
    private String email;
    private String address;
    private LocalDateTime dob;
    private double BMI;
    private String phoneNumber;
    private String registrationFree;
    private double subscription;
}
