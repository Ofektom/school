package org.example.services;

import org.example.entities.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface StudentServices {

    String learn(Subject subject);
    Payment payFees(Payment payment);
    Set<Question> takeAssessment(Assessment assessment);
    Map<Person, List<Subject>> registerSubject(Person student, List<Subject> subjects);

}
