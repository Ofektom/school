package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    private String title;
    private Teacher teacher;
    private String content;
    private String duration;
}
