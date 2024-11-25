package coffeeShopSystem;

public class CoffeeFactory {
  public Coffee orderCoffee(CoffeeType type) {

    /**
     * createCoffee Method create coffee 
     */
    return type.createCoffee();
  }
}
