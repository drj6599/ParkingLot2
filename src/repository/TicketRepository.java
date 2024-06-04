package repository;
import exception.TicketNotFoundException;
import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer,Ticket> ticketMap;
    private static int idCounter = 0;

    public TicketRepository() {
        this.ticketMap = new HashMap<Integer,Ticket>();
    }

    public Ticket getTicket(int ticketId){
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null){
            throw new TicketNotFoundException("Ticket is not present in the database");
        }
        return ticket;
    }

    public Ticket addTicket(Ticket ticket){
        ticket.setId(++idCounter);
        ticketMap.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added successfully");
        return ticketMap.get(idCounter);
    }
}
