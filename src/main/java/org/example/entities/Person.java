package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.DTOs.StudentDTO;
import org.example.DTOs.TeacherDTO;
import org.example.enums.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person>{

    private String personId;
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private Long phoneNumber;
    private Address address;
    private String email;
    private BigDecimal salary;
    private Long bvn;
    private Role role;
    private Performance performance;
    private LocalDate appointmentDate;
    private LocalDate lastPromotionDate;
    private Map<Long, String> accountDetails;
    private SubjectName specialization;
    private String gradeLevel;
    private String guardianEmail1;
    private String guardianEmail2;
    private Payment applicationFee;
    private LocalDate applicationDate;
    private Boolean isAdmitted;
    private String isArchived;
    private String isDeleted;


    public Person(StudentDTO studentDTOS) {
        this.setFirstName(studentDTOS.getFirstName());
        this.setLastName(studentDTOS.getLastName());
        this.role = studentDTOS.getRole();

    }

    public Person(TeacherDTO teacherDTO){
        this.setFirstName(teacherDTO.getFirstName());
        this.setLastName(teacherDTO.getLastName());
        this.role = teacherDTO.getRole();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "personId='" + personId + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", gradeLevel='" + gradeLevel + '\'' +
//                ", guardianEmail1='" + guardianEmail1 + '\'' +
//                ", guardianEmail2='" + guardianEmail2 + '\'' +
//                ", isArchived='" + isArchived + '\'' +
//                ", isDeleted='" + isDeleted + '\'' +
//                "\n" +
//                '}';
//    }

    @Override
    public int compareTo(Person person) {

        return (this.getRole().compareTo(person.getRole()));
    }
}
