package DesignPattern.StrategyPa;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("1+5= " + context.executeStrategy(1,5));
    }
}
