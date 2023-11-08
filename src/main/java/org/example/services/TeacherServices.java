package org.example.services;

import org.example.entities.*;

import java.util.Map;

public interface TeacherServices {
    String teach(Subject subject);
    Long assess(Assessment assessment, Person student);
    Map<Person, StudentReport> promoteStudent(Person student, StudentReport studentReport);

}
