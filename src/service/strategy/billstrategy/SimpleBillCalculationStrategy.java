package service.strategy.billstrategy;

import model.Bill;
import model.Ticket;
import model.enums.BillStatus;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

public class SimpleBillCalculationStrategy implements BillCalculationStrategy {
    //1 sec is 1 Rs.
    //TODO update the method to pass gate as well and update
    @Override
    public Bill generateBill(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long numberOfSeconds = Duration.between(exitTime,entryTime).getSeconds();
        long amount = numberOfSeconds;
        Bill bill = new Bill();
        bill.setAmount(amount);
        bill.setTicket(ticket);
        bill.setExitTime(exitTime);
        bill.setId(exitTime.hashCode());
        bill.setBillStatus(BillStatus.UNPAID);
        return bill;
    }
}
