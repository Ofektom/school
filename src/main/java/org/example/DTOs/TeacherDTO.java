package org.example.DTOs;

import lombok.Data;
import org.example.enums.Role;

@Data
public class TeacherDTO {
    private String firstName;
    private String lastName;
    private Role role;

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }
}
