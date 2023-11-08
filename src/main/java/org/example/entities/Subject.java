package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.SubjectName;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    private SubjectName title;
    private String content;
    private Integer durationInMinutes;
}
