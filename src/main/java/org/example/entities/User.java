package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.Gender;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
    private String name;
    private Integer age;
    private Gender gender;
    private Long phoneNumber;
    private Address address;
    private String email;
}
