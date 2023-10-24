package org.example.serviceImpl;

import org.example.entities.Payment;
import org.example.entities.Staff;
import org.example.enums.Role;
import org.example.services.NonAcademicServices;

import java.math.BigDecimal;

public class NonAcademicServiceImpl implements NonAcademicServices {
    @Override
    public BigDecimal paysSalary(Staff accountant, Staff staff, Payment payment){
        if(accountant.getRole().equals(Role.ACCOUNTANT)) {
            staff.setSalary(payment.getAmount());
            return payment.getAmount();
        }
        return null;
    }
}
