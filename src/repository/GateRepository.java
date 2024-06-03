package repository;

import exception.GateNotFoundException;
import model.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<Integer,Gate>();
    }

    public Gate getGate(int gateId){
        Gate gate = gateMap.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("Gate is not present in the database");
        }
        return gate;
    }

    public void addTicket(Gate gate){
        gateMap.put(gate.getId(), gate);
        System.out.println("Gate added to the database successfully");
    }
}
