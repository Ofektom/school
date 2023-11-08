package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    public static Map<Book, Integer> listOfBooks = new HashMap<>();

    private Book book;
    private Integer quantity;

}
