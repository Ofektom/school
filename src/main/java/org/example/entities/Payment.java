package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.PayMethod;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Person person;
    private Long PaymentID;
    private BigDecimal amount;
    private String Description;
    private LocalDate paymentDate;
    private PayMethod payMethod;
    private Boolean isCleared;
}
