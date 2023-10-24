package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.Conduct;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentReport {
    private Student student;
    private Double averageScore;
    private Conduct conduct;
}
