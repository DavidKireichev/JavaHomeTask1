package Task1;

public class HotDrinkMachine implements TradeMachine { 
    @Override 

    public HotDrink getProduct(String name, int volume) {
        return new HotDrink(name, volume);
    }

    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) { 
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}
