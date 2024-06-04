package service.strategy.billstrategy;

public class BillCalculationStrategyFactory {
    // TODO : add SurgeBillCalculationStrategy with enum and update here
    public static BillCalculationStrategy getBill(){
        return new SimpleBillCalculationStrategy();
    }
}
