package org.example.serviceImpl;

import org.example.entities.Book;
import org.example.DTOs.LibraryDTO;
import org.example.entities.Library;
import org.example.entities.Person;
import org.example.enums.Role;
import org.example.services.LibraryServices;

import java.util.*;

public class LibraryServiceImpl implements LibraryServices {
    public static Map<Person, Book> approvedBookList = new LinkedHashMap<>();

    public LibraryDTO requestLibraryBook(Person person, Book book) {
        LibraryDTO libraryRequest = new LibraryDTO();
        if (person.getRole().equals(Role.TEACHER) || person.getRole().equals(Role.SENIOR_STUDENT) || person.getRole().equals(Role.JUNIOR_STUDENT)) {
            libraryRequest.setPerson(person);
            libraryRequest.setBook(book);
            LibraryDTO.bookRequestList.put(person, book);
            return libraryRequest;

        }
        return libraryRequest;
    }


    public Map<Person, Book> approveBookRequest(LibraryDTO request1, LibraryDTO request2) {
        Person person1 = request1.getPerson();
        Person person2 = request2.getPerson();
        Book requestedBook1 = request1.getBook();
        Book requestedBook2 = request2.getBook();


        if (requestedBook1.equals(requestedBook2)) {
            PriorityQueue<Person> pq = new PriorityQueue<>();

            pq.add(person1);
            pq.add(person2);

            while (!pq.isEmpty()) {
                approvedBookList.put(pq.poll(), requestedBook2);
            }

            // Reduce the quantity of the book in the list
            if (Library.listOfBooks.containsKey(requestedBook2)) {
                int quantity = Library.listOfBooks.get(requestedBook2);
                if (quantity > 0) {
                    Library.listOfBooks.put(requestedBook2, quantity - 1);
                }
            }
        } else {
            // Handle cases where the requests are not the same
            approvedBookList.clear();
            approvedBookList.put(person2, requestedBook2);
            approvedBookList.put(person1, requestedBook1);

        }

        return approvedBookList;
    }
}

    /*public Map<Person, Integer> approveBookRequest(LibraryDTO request1, LibraryDTO request2) {
        Person person1 = request1.getPerson();
        Person person2 = request2.getPerson();
        Book requestedBook1 = request1.getBook();
        Book requestedBook2 = request2.getBook();

        Map<Person, Integer> approvedBookList = new HashMap<>(); // Use a Map to store approved book requests and corresponding quantities

        if (requestedBook1.equals(requestedBook2)) {
            PriorityQueue<Person> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Reverse order for higher priority

            pq.add(person1);
            pq.add(person2);

            if (Library.listOfBooks.containsKey(requestedBook2)) {
                int quantity = Library.listOfBooks.get(requestedBook2);

                if (quantity >= 2) {
                    while (!pq.isEmpty()) {
                        approvedBookList.put(pq.poll(), 1); // Assign a quantity of 1 for each person
                    }
                    // Reduce the quantity of the book by 2
                    Library.listOfBooks.put(requestedBook2, quantity - 2);
                } else if (quantity == 1) {
                    approvedBookList.put(pq.poll(), 1); // Assign a quantity of 1 to the first person
                    approvedBookList.put(pq.poll(), 0); // Assign a quantity of 0 for the second person
                    // Reduce the quantity of the book by 1
                    Library.listOfBooks.put(requestedBook2, quantity - 1);
                } else {
                    while (!pq.isEmpty()) {
                        approvedBookList.put(pq.poll(), 0); // Assign a quantity of 0 for each person
                    }
                }
            } else {
                while (!pq.isEmpty()) {
                    approvedBookList.put(pq.poll(), 0); // Assign a quantity of 0 for each person
                }
            }
        } else {
            // Handle cases where the requests are not the same
            approvedBookList.put(person1, 0); // Assign a quantity of 0 for the first person
            approvedBookList.put(person2, 0); // Assign a quantity of 0 for the second person
        }

        return approvedBookList;
    }
}*/

   /* public Map<Person, Book> approveBookRequest(LibraryDTO request1, LibraryDTO request2) {
        Person person1 = request1.getPerson();
        Person person2 = request2.getPerson();
        Book requestedBook1 = request1.getBook();
        Book requestedBook2 = request2.getBook();

        Map<Person, Book> approvedBookList = new HashMap<>(); // Use a Map to store approved book requests

        if (requestedBook1.equals(requestedBook2)) {
            PriorityQueue<Person> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Reverse order for higher priority

            pq.add(person1);
            pq.add(person2);

            if (Library.listOfBooks.containsKey(requestedBook2)) {
                int quantity = Library.listOfBooks.get(requestedBook2);

                if (quantity >= 2) {
                    while (!pq.isEmpty()) {
                        Person person = pq.poll();
                        approvedBookList.put(person, requestedBook2);
                    }
                    // Reduce the quantity of the book by 2
                    Library.listOfBooks.put(requestedBook2, quantity - 2);
                } else if (quantity == 1) {
                    // Approve one person and set the book as "null" for the second person
                    Person approvedPerson = pq.poll();
                    approvedBookList.put(approvedPerson, requestedBook2);
//                    approvedBookList.put(pq.poll(), null);
                    // Reduce the quantity of the book by 1
                    Library.listOfBooks.put(requestedBook2, quantity - 1);
                } else {
                    while (!pq.isEmpty()) {
                        approvedBookList.put(pq.poll(), null); // Set the book as "null" for each person
                    }
                }
            } else {
                while (!pq.isEmpty()) {
                    approvedBookList.put(pq.poll(), null); // Set the book as "null" for each person
                }
            }
        } else {
            // Handle cases where the requests are not the same
            approvedBookList.put(person1, requestedBook1);
            approvedBookList.put(person2, requestedBook2);
        }

        return approvedBookList;
    }
}*/


//class PersonComparator implements Comparator<Person>{
//    public int compare(Person p1, Person p2) {
//
//        return p1.getRole().compareTo(p2.getRole());
//    }
//}
