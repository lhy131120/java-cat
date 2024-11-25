package coffeeShopSystem;

public class Espresso extends Coffee{
  
  public Espresso() {
    super("Espresso");
  }

  @Override
  protected void addIngredients() {
    // Espresso 無額外配料
  }

  @Override
  protected boolean needsIngredients() {
    return false;
  }
}
