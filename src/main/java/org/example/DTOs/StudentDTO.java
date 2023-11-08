package org.example.DTOs;

import lombok.Data;
import org.example.enums.Role;

@Data
public class StudentDTO {
    private String firstName;
    private String lastName;
    private Role role;

    @Override
    public String toString() {
        return "StudentDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }
}
