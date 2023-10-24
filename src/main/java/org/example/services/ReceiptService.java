package org.example.services;

import org.example.entities.Payment;

public interface ReceiptService {
    void printReceipt(Long transactionId, Payment payment);

}
