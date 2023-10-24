package org.example.serviceImpl;

import org.example.entities.*;
import org.example.services.StudentServices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentServiceImpl implements StudentServices {
    public static Map<Student, List<Subject>> studentSubjectChoice = new HashMap<>();
    public String learn(Subject subject){
       return  subject.getContent();
    }
    public Payment payFees(Payment payment){
        return payment;
    }
    public Set<Question> takeAssessment(Assessment assessment){
        return assessment.getQuestions();
    }
    public Map<Student, List<Subject>> registerSubject(Student student, List<Subject> subjects){
        studentSubjectChoice.put(student, subjects);
        return studentSubjectChoice;
    }
}
