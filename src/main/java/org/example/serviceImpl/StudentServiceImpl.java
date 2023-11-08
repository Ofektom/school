package org.example.serviceImpl;

import org.example.entities.*;
import org.example.enums.GradeLevel;
import org.example.enums.Role;
import org.example.services.StudentServices;
import org.example.utility.FileInputServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class StudentServiceImpl implements StudentServices {
    public static List<Person> studentRegister = new ArrayList<>();
    public static Map<Person, List<Subject>> studentSubjectChoice = new HashMap<>();
    FileInputServiceImpl dataInput = new FileInputServiceImpl();

    public String learn(Subject subject) {
        return subject.getContent();
    }

    public Payment payFees(Payment payment) {
        return payment;
    }

    public Set<Question> takeAssessment(Assessment assessment) {
        return assessment.getQuestions();
    }

    public Map<Person, List<Subject>> registerSubject(Person student, List<Subject> subjects) {
        studentSubjectChoice.put(student, subjects);
        return studentSubjectChoice;
    }

    public void studentDetails(BufferedReader bufReader) throws IOException {
        String line;
        while ((line = bufReader.readLine()) != null) {

            String[] data = line.split(",", -1); // To keep trailing empty values
            String ID = "";
            String firstName = "";
            String lastName = "";
            String gradeLevel = "";
            String email = "";
            String guardianEmail1 = "";
            String guardianEmail2 = "";
            String isArchived = "";
            String isDeleted = "";

            for (int i = 0; i < data.length; i++) {
                if (data[i].isEmpty()) {
                    data[i] = null; // Replace empty values with null
                }
                switch (i){
                    case 0:ID=data[i];
                    break;
                    case 1: firstName=data[i];
                    break;
                    case 2: lastName=data[i];
                    break;
                    case 3: gradeLevel=data[i];
                    case 4: email=data[i];
                    case 5: guardianEmail1=data[i];
                    case 6: guardianEmail2=data[i];
                    case 7: isArchived=data[i];
                    case 8: isDeleted=data[i];
                }


            }

               Person student = Person.builder()
                        .personId(ID)
                        .firstName(firstName)
                        .lastName(lastName)
                        .gradeLevel(gradeLevel)
                        .email(email)
                        .guardianEmail1(guardianEmail1)
                        .guardianEmail2(guardianEmail2)
                        .isArchived(isArchived)
                        .isDeleted(isDeleted)
                        .role(Role.SENIOR_STUDENT)
                        .build();
                studentRegister.add(student);

        }
    }
}