package org.example.serviceImpl;

import org.example.entities.*;
import org.example.enums.Conduct;
import org.example.enums.Performance;
import org.example.enums.Role;
import org.example.services.PrincipalServices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrincipalServiceImpl implements PrincipalServices {
    public static List<Student> studentRegister = new ArrayList<>();
    public static List<Staff> staffRegister = new ArrayList<>();
    public static HashMap<Role, List<Staff>> allStaffs =  new HashMap<>();
    @Override
    public Student admit(Applicant applicant){
        if (applicant.getAge() <= 20) {
            studentRegister.add(applicant);
            return applicant;
        }
        return null;
    }
    @Override
    public Student expel(StudentReport studentReport){
        if(studentReport.getConduct().equals(Conduct.GROSS_MISCONDUCT)){
            return studentRegister.remove(studentRegister.indexOf(studentReport.getStudent()));
        }
        return null;
    }
    @Override
    public Staff employ(Staff staff){
        if(staff.getRole().equals(Role.NONE)){
            staffRegister.add(staff);
            return staff;
        }
        return null;
    }
    @Override
    public Staff retrench(Staff staff){
        if(staff.getPerformance().equals(Performance.POOR)){
            staffRegister.remove(staff);
            return staff;
        }
        return null;
    }
    @Override
    public void assignsDuties(Staff staff, Role role){
        staff.setRole(role);
    }
    @Override
    public List<Student> viewAllStudents() {
        return studentRegister;
    }
    @Override
    public List<Staff> viewAllStaff() {
        return staffRegister;
    }
}
