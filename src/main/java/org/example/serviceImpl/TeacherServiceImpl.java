package org.example.serviceImpl;

import org.example.entities.*;
import org.example.enums.Role;
import org.example.services.TeacherServices;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherServiceImpl implements TeacherServices {
    public static Map<Person, StudentReport> studentLedger = new HashMap<>();
    public static List<Person> teacherList = new ArrayList<>();
    @Override
    public String teach(Subject subject){
        return subject.getContent();
    }
    @Override
    public Long assess(Assessment assessment, Person student){
        return null;
    }
    @Override
    public Map<Person, StudentReport> promoteStudent(Person student, StudentReport studentReport){
        return studentLedger;
    }

    public void teacherDetails(BufferedReader bufReader) throws IOException {
        String line;
        while ((line = bufReader.readLine()) != null) {
            String[] data = line.split(",", -1); // To keep trailing empty values
            String ID = "";
            String email = "";
            String firstName = "";
            String lastName = "";


            for (int i = 0; i < data.length; i++) {
                if (data[i].isEmpty()) {
                    data[i] = null; // Replace empty values with null
                }
                switch(i){
                    case 0:ID= data[i];
                    break;
                    case 4:email=data[i];
                    break;
                    case 1:firstName=data[i];
                    case 2:lastName=data[i];
                }
            }
            Person teacher = Person.builder()
                    .personId(ID)
                    .email(email)
                    .firstName(firstName)
                    .lastName(lastName)
                    .build();
            teacher.setRole(Role.TEACHER);
            teacherList.add(teacher);


        }
    }
}
