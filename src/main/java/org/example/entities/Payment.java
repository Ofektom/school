package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.PayMethod;
import org.example.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private User user;
    private Long PaymentID;
    private BigDecimal amount;
    private String Description;
    private LocalDate paymentDate;
    private PayMethod payMethod;
    private PaymentStatus status;
}
