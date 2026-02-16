public class StrategyApp{
    public static void main(String[] args){
        StrategyGame knight = new StrategyGame (new Knight());
        knight.attack();
        knight.defend();

        StrategyGame wizard = new StrategyGame (new Wizard());
        wizard.attack();
        wizard.defend();

        StrategyGame archer = new StrategyGame (new Archer());
        archer.attack();
        archer.defend();
    }
}
