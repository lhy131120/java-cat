package coffeeShopSystem;

public enum CoffeeType {
  ESPRESSO {
    @Override
    public Coffee createCoffee() {
      return new Espresso();
    }
  },
  CAPPUCCINO {
    @Override
    public Coffee createCoffee() {
      return new Cappuccino();
    }
  },
  LATTE {
    @Override
    public Coffee createCoffee() {
      return new Latte();
    }
  },;

  // Abstract Method：每個枚舉常量實現自己的咖啡創建方法
  public abstract Coffee createCoffee();
}
