package coffeeShopSystem;

public class CoffeeShop {
  public static void main(String[] args) {
    CoffeeFactory factory = new CoffeeFactory();

    Coffee espresso = factory.orderCoffee(CoffeeType.ESPRESSO);
    System.out.println(espresso.getNmae());
    espresso.prepare();

    Coffee cappuccino = factory.orderCoffee(CoffeeType.CAPPUCCINO);
    System.out.println(espresso.getNmae());
    cappuccino.prepare();

    Coffee latte = factory.orderCoffee(CoffeeType.LATTE);
    System.out.println(latte.getNmae());
    latte.prepare();
  }
}
