package org.example.services;

import org.example.entities.Payment;
import org.example.entities.Staff;

import java.math.BigDecimal;

public interface NonAcademicServices {
    BigDecimal paysSalary(Staff accountant, Staff staff, Payment payment);
}
