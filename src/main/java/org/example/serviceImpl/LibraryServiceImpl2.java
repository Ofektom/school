package org.example.serviceImpl;

import org.example.DTOs.LibraryDTO;
import org.example.entities.Book;
import org.example.entities.Person;
import org.example.enums.Role;
import org.example.services.LibraryServices;

import java.util.LinkedHashMap;
import java.util.Map;

public class LibraryServiceImpl2 implements LibraryServices {
    public LibraryDTO requestLibraryBook(Person person, Book book){
        LibraryDTO libraryRequest = new LibraryDTO();
        if (person.getRole().equals(Role.TEACHER) || person.getRole().equals(Role.SENIOR_STUDENT) || person.getRole().equals(Role.JUNIOR_STUDENT)) {
            libraryRequest.setPerson(person);
            libraryRequest.setBook(book);
            LibraryDTO.bookRequestList.put(person, book);
            return libraryRequest;

        }
        return libraryRequest;
    }
    public Map<Person, Book> approveBookRequest(LibraryDTO  request1, LibraryDTO request2){
        Person person1 = request1.getPerson();
        Person person2 = request2.getPerson();
        Book requestedBook1 = request1.getBook();
        Book requestedBook2 = request2.getBook();
        LibraryServiceImpl.approvedBookList.clear();
        LibraryServiceImpl.approvedBookList.put(person1, requestedBook1);
        LibraryServiceImpl.approvedBookList.put(person2,requestedBook2);
        return LibraryServiceImpl.approvedBookList;
    }
}
