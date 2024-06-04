package service.strategy.spotstrategy;

public class SpotAllocationStrategyFactory {
    //TODO : add more spot allocation strategies, with ENUM and implement here
    public static SpotAllocationStrategy getSpotAllocationStrategy(){
        return new LinearSpotAllocationStrategy();
    }
}
