package org.example.serviceImpl;

import org.example.entities.Assessment;
import org.example.entities.Student;
import org.example.entities.StudentReport;
import org.example.entities.Subject;
import org.example.services.TeacherServices;

import java.util.HashMap;
import java.util.Map;

public class TeacherServiceImpl implements TeacherServices {
    public static Map<Student, StudentReport> studentLedger = new HashMap<>();
    @Override
    public String teach(Subject subject){
        return subject.getContent();
    }
    @Override
    public Long assess(Assessment assessment, Student student){
        return null;
    }
    @Override
    public Map<Student, StudentReport> promoteStudent(Student student, StudentReport studentReport){
        return studentLedger;
    }
}
