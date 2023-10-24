package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.Classes;

@Data
@Builder
@AllArgsConstructor@NoArgsConstructor
public class Student extends User{
    private String admissionNumber;
    private Classes classes;
}
