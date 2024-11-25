package coffeeShopSystem;

public class Latte extends Coffee{
  public Latte() {
    super("Latte");
  }

  @Override
  protected void addIngredients() {
    System.out.println("Adding milk...");
  }

  @Override
  protected boolean needsIngredients() {
    return true;
  }
}
