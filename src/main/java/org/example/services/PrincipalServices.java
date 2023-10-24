package org.example.services;

import org.example.entities.Applicant;
import org.example.entities.Staff;
import org.example.entities.Student;
import org.example.entities.StudentReport;
import org.example.enums.Role;

import java.util.List;

public interface PrincipalServices {
    Student admit(Applicant applicant);
    Student expel(StudentReport studentReport);
    Staff employ(Staff staff);
    Staff retrench(Staff staff);

    void assignsDuties(Staff staff, Role role);
    List<Student> viewAllStudents();
    List<Staff> viewAllStaff();
}
