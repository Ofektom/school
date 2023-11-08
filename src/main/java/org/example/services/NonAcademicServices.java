package org.example.services;

import org.example.entities.Payment;
import org.example.entities.Person;

import java.math.BigDecimal;

public interface NonAcademicServices {
    BigDecimal paysSalary(Person accountant, Person staff, Payment payment);
}
