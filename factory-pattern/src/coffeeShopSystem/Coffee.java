package coffeeShopSystem;

public abstract class Coffee {
  private String name;

  /*
   * Constructor
   */
  public Coffee(String name) {
    this.name = name;
  }

  public String getNmae() {
    return this.name;
  }

  /*
   * Methods List
   * 
   * grindBeans 
   * brew 
   * pourInCup
   * addIngredients
   * 
   */

  private void grindBeans() {
    System.out.println("Grinding coffee beans...");
  }

  private void brew(){
    System.out.println("Brewing coffee...");
  }

  private void pourInCup() {
    System.out.println("Pouring into cup...");
  }

  protected boolean needsIngredients() {
    return false;
  }

  // abstract method：不同咖啡的特定配料
  protected abstract void addIngredients();

  public final void prepare() {
    grindBeans();
    brew();
    pourInCup();
    if (needsIngredients()) {
      addIngredients();
    }
    System.out.println(name + " is ready!\n");
  }
}
