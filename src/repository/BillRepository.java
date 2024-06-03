package repository;

import exception.BillNotFoundException;
import exception.TicketNotFoundException;
import model.Bill;
import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class BillRepository {
    private Map<Integer, Bill> billMap;

    public BillRepository() {
        this.billMap = new HashMap<Integer,Bill>();
    }

    public Bill getTicket(int billId){
        Bill bill = billMap.get(billId);
        if(bill == null){
            throw new BillNotFoundException("Bill is not present in the database");
        }
        return bill;
    }

    public void addTicket(Bill bill){
        billMap.put(bill.getId(), bill);
        System.out.println("Bill added to the database successfully");
    }
}
