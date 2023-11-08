package org.example.serviceImpl;

import org.example.entities.*;
import org.example.enums.Conduct;
import org.example.enums.Performance;
import org.example.enums.Role;
import org.example.services.PrincipalServices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class PrincipalServiceImpl implements PrincipalServices<Person > {

    public static List<Person> staffRegister = new ArrayList<>();
    public static HashMap<Role, List<Person>> allStaffs =  new HashMap<>();
    @Override
    public Person admit(Person applicant){
        if (applicant.getAge() <= 20) {
            //studentRegister.add(applicant);
            return applicant;
        }
        return null;
    }
    @Override
    public Person expel(StudentReport studentReport){
        if(studentReport.getConduct().equals(Conduct.GROSS_MISCONDUCT)){
            return StudentServiceImpl.studentRegister.remove(StudentServiceImpl.studentRegister.indexOf(studentReport.getStudent()));
        }
        return null;
    }
    @Override
    public Person employ(Person staff){
        if(staff.getRole()==null){
            staffRegister.add(staff);
            return staff;
        }
        return null;
    }
    @Override
    public Person retrench(Person staff){
        if(staff.getPerformance().equals(Performance.POOR)){
            staffRegister.remove(staff);
            return staff;
        }
        return null;
    }
    @Override
    public void assignsDuties(Person staff, Role role){
        staff.setRole(role);
    }
    @Override
    public List<Person> viewAllStudents() {
        return StudentServiceImpl.studentRegister;
    }
    @Override
    public List<Person> viewAllStaff() {
        return staffRegister;
    }
}
