package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.AssessmentType;
import org.example.enums.GradeLevel;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assessment {
    private Person student;
    private Subject subject;
    private Set<Question> questions;
    private GradeLevel classes;
    private AssessmentType type;
    private Integer score;
}
