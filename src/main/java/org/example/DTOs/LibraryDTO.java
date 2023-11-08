package org.example.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entities.Book;
import org.example.entities.Person;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LibraryDTO {
    public static Map<Person, Book> bookRequestList = new LinkedHashMap<>();

    private Person person;
    private Book book;
}
