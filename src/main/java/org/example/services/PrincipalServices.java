package org.example.services;

import org.example.entities.Person;
import org.example.entities.StudentReport;
import org.example.enums.Role;

import java.util.List;

public interface PrincipalServices<P > {
    P admit(Person applicant);
    P expel(StudentReport studentReport);
    P employ(Person staff);
    P retrench(Person staff);

    void assignsDuties(Person staff, Role role);
    List<Person> viewAllStudents();
    List<Person> viewAllStaff();
}
