package repository;

import exception.PaymentNotFoundException;
import model.Payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentRepository {
    private Map<Integer, Payment> paymentMap;

    public PaymentRepository() {
        this.paymentMap = new HashMap<Integer,Payment>();
    }

    public Payment getPayment(int paymentId){
        Payment payment = paymentMap.get(paymentId);
        if(payment == null){
            throw new PaymentNotFoundException("Payment is not present in the database");
        }
        return payment;
    }

    public void add(Payment payment){
        paymentMap.put(payment.getId(), payment);
        System.out.println("Payment added to the database successfully");
    }
}
