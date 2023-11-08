package org.example;

import org.example.DTOs.LibraryDTO;
import org.example.DTOs.StudentDTO;
import org.example.DTOs.TeacherDTO;
import org.example.entities.Book;
import org.example.entities.Library;
import org.example.entities.Person;
import org.example.enums.Role;
import org.example.serviceImpl.LibraryServiceImpl;
import org.example.serviceImpl.LibraryServiceImpl2;
import org.example.serviceImpl.TeacherServiceImpl;
import org.example.utility.FileInputServiceImpl;
import org.example.serviceImpl.StudentServiceImpl;
import org.example.utility.SaveStudentInfo;
import org.example.utility.SaveTeacherInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        //BigDecimal fees = new BigDecimal("87_500.45");
//        Person applicant1 = Person.builder()
//                .personId(3)
//                .firstName("Mfonobong")
//                .lastName("Eyo")
//                .age(9)
//                .gender(Gender.FEMALE)
//                .applicationFee(new Payment())
//                .applicationDate(LocalDate.now())
//                .gradeLevel(GradeLevel.L_1)
//                .build();
//
//        Person applicant2 = Person.builder()
//                .personId(2)
//                .firstName("Okon")
//                .lastName("Etim")
//                .age(12)
//                .gender(Gender.MALE)
//                .applicationFee(new Payment())
//                .applicationDate(LocalDate.now())
//                .gradeLevel(GradeLevel.L_2)
//                .build();
//
//        Person applicant3 = Person.builder()
//                .applicationFee(new Payment())
//                .applicationDate(LocalDate.now())
//                .gradeLevel(GradeLevel.L_3)
//                .personId(5)
//                .firstName("Titilayo")
//                .lastName("Banjo")
//                .age(16)
//                .gender(Gender.FEMALE)
//                .build();
//
//        Person teacher1 = Person.builder()
//                .specialization(SubjectName.COMPUTER_STUDIES)
//                .personId(1)
//                .firstName("Wole")
//                .lastName("Adenuga")
//                .role(Role.TEACHER)
//                .build();
//
//
//        Person principal = Person.builder()
//                .firstName("Matthew")
//                .lastName("Uchnna")
//                .role(Role.PRINCIPAL)
//                .build();



        FileInputServiceImpl fileImpl = new FileInputServiceImpl();
        BufferedReader input = fileImpl.openFile("/Users/mac/IdeaProjects/school/src/main/java/org/example/utility/studentData.csv");
        BufferedReader input2 = fileImpl.openFile("/Users/mac/IdeaProjects/school/src/main/java/org/example/utility/teacherData.csv");


        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.studentDetails(input);

        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        teacherService.teacherDetails(input2);

        Book book1 = new Book();
        book1.setBookTitle("Things Fall Apart");
        book1.setAuthor("Chinua Achebe");

        Book book2 = new Book();
        book2.setBookTitle("Pride and Prejudice");
        book2.setAuthor("William Shakespeare");

        Library library1 = new Library();
        library1.setBook(book1);
        library1.setQuantity(2);

        Library library2 = new Library();
        library2.setBook(book2);
        library2.setQuantity(1);

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.setFirstName("Chioma");
        studentDTO1.setLastName("Okeke");
        studentDTO1.setRole(Role.JUNIOR_STUDENT);
        Person student1 = new Person(studentDTO1);

        StudentDTO studentDTO2 = new StudentDTO();
        studentDTO2.setFirstName("Emem");
        studentDTO2.setLastName("Uwem");
        studentDTO2.setRole(Role.SENIOR_STUDENT);
            Person student2 = new Person(studentDTO2);

        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setFirstName("Owen");
        teacherDTO.setLastName("Martins");
        teacherDTO.setRole(Role.TEACHER);
        Person teacher = new Person(teacherDTO);


        System.out.println("FIRST COME FIRST SERVE BASIS:");
        LibraryServiceImpl2 libraryService2 = new LibraryServiceImpl2();
        LibraryDTO bookRequest11 =  libraryService2.requestLibraryBook(student1, book1);
        LibraryDTO bookRequest22 =  libraryService2.requestLibraryBook(student2, book2);
        LibraryDTO bookRequest33 =  libraryService2.requestLibraryBook(teacher, book2);
        Map<Person, Book> response2 =  libraryService2.approveBookRequest(bookRequest11, bookRequest22);
        int count2 =0;
        for(Map.Entry<Person, Book> m: response2.entrySet()) {
            System.out.println(++count2 +" " + m.getKey().getRole() + " " + m.getKey().getFirstName()+" "+ m.getKey().getLastName() + " --> " + m.getValue().getBookTitle() + " by " + m.getValue().getAuthor());
        }
        System.out.println(" ");

        System.out.println("ORDER OF PRIORITY:");
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        LibraryDTO bookRequest1 =  libraryService.requestLibraryBook(student1, book1);
        LibraryDTO bookRequest2 =  libraryService.requestLibraryBook(student2, book2);
        LibraryDTO bookRequest3 =  libraryService.requestLibraryBook(teacher, book2);
        Map<Person, Book> response =  libraryService.approveBookRequest(bookRequest1, bookRequest2);
        int count =0;
        for(Map.Entry<Person, Book> m: response.entrySet()) {
            System.out.println(++count +" " + m.getKey().getRole() + " " + m.getKey().getFirstName()+" "+ m.getKey().getLastName() + " --> " + m.getValue().getBookTitle() + " by " + m.getValue().getAuthor());
        }









//        System.out.println("STUDENT' LIST");
//        System.out.println(StudentServiceImpl.studentRegister);

//        System.out.println("TEACHER' LIST");
//        for(Person student:StudentServiceImpl.studentRegister) {
//            System.out.println(student.getFirstName() + " " + student.getGradeLevel() + " " + student.getRole());
//        }
//
//
//        System.out.println("STUDENT ");
//        for(Person teacher:TeacherServiceImpl.teacherList){
//            System.out.println(teacher.getFirstName() +" "+ teacher.getRole());
//        }


//        Library.listOfBooks.put(book1, teacher)



//        String fileName = "/Users/mac/Downloads/studentInfo.csv";
//        SaveStudentInfo outputImp = new SaveStudentInfo();
//        outputImp.saveFile(StudentServiceImpl.studentRegister, fileName);
//
//        String fileName2 = "/Users/mac/Downloads/teacherInfo.csv";
//        SaveTeacherInfo teacherInfo = new SaveTeacherInfo();
//        teacherInfo.saveFile(TeacherServiceImpl.teacherList, fileName2);

//        PrincipalServiceImpl principalService1 = new PrincipalServiceImpl();
//        principalService1.admit(applicant1);
//        PrincipalServiceImpl principalService2 = new PrincipalServiceImpl();
//        principalService2.admit(applicant2);
//        PrincipalServiceImpl principalService3 = new PrincipalServiceImpl();
//        principalService3.admit(applicant3);

//        System.out.println(PrincipalServiceImpl.studentRegister);
    }
}