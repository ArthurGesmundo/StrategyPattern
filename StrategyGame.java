public class StrategyGame {
    private Strategy strategy;

    public StrategyGame(Strategy strategy){
        this.strategy = strategy;
    }

    public void attack(){
        strategy.attack();
    }    
    public void defend(){
        strategy.defend();
    }
}
