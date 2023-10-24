package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.ApplicationStatus;
import org.example.enums.Classes;
import org.example.enums.Role;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Applicant extends Student{
    private Payment applicationFee;
    private LocalDate applicationDate;
    private Classes classes;
    private ApplicationStatus status;
}
