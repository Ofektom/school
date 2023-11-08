package org.example.serviceImpl;

import org.example.entities.Payment;

import java.util.Objects;

public class ReceiptServiceImpl {

    public void printReceipt(Long transactionId, Payment payment){
        if (Objects.equals(transactionId, payment.getPaymentID())){
            System.out.println("Name: " + payment.getPerson().getFirstName()+
                            payment.getPerson().getLastName()+
                    "Description: "+ payment.getDescription()+
                    "Amount: "+ payment.getAmount());
        }
    }
}
