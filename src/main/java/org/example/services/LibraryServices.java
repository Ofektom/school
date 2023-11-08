package org.example.services;

import org.example.DTOs.LibraryDTO;
import org.example.entities.Book;
import org.example.entities.Person;

import java.util.HashMap;
import java.util.Map;

public interface LibraryServices {
    LibraryDTO requestLibraryBook(Person person, Book book);
    Map<Person, Book> approveBookRequest(LibraryDTO  request1, LibraryDTO request2);

}
