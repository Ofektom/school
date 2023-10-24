package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.AssessType;
import org.example.enums.Classes;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assessment {
    private Student student;
    private Subject subject;
    private Set<Question> questions;
    private Classes classes;
    private AssessType type;
    private Integer score;
}
