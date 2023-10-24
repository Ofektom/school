package org.example.services;

import org.example.entities.Assessment;
import org.example.entities.Student;
import org.example.entities.StudentReport;
import org.example.entities.Subject;

import java.util.Map;

public interface TeacherServices {
    String teach(Subject subject);
    Long assess(Assessment assessment, Student student);
    Map<Student, StudentReport> promoteStudent(Student student, StudentReport studentReport);
}
