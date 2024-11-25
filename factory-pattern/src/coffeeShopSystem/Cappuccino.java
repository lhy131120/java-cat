package coffeeShopSystem;

public class Cappuccino extends Coffee{
  public Cappuccino() {
    super("Cappuccino");
  }

  @Override
  protected void addIngredients() {
    System.out.println("Adding milk foam...");
  }

  @Override
  protected boolean needsIngredients() {
    return true;
  }
}
