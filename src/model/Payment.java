package model;

import model.enums.PaymentMode;
import model.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private double amount;
    private String transactionRefNumber;
    private PaymentStatus paymentStatus;
    private Bill bill;
    private PaymentMode paymentMode;
    private LocalDateTime paymentTime;

    public Payment() {
    }

    public Payment(double amount, String transactionRefNumber, PaymentStatus paymentStatus, Bill bill, PaymentMode paymentMode, LocalDateTime paymentTime) {
        this.amount = amount;
        this.transactionRefNumber = transactionRefNumber;
        this.paymentStatus = paymentStatus;
        this.bill = bill;
        this.paymentMode = paymentMode;
        this.paymentTime = paymentTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionRefNumber() {
        return transactionRefNumber;
    }

    public void setTransactionRefNumber(String transactionRefNumber) {
        this.transactionRefNumber = transactionRefNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}