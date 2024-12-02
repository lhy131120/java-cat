import java.util.ArrayList;

public class DemoGeneric<T> {
  private T t;
  
  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public static void main(String[] args) {
    DemoGeneric<Double> generic = new DemoGeneric<>();
    generic.set(1.983);
    System.out.println(generic.get());

    DemoGeneric<Integer> intGeneric = new DemoGeneric<>();
    intGeneric.set(32);
    System.out.println(intGeneric);
    
    DemoGeneric<String[]> stringBox = new DemoGeneric<>();
    stringBox.set(new String[] {"sad", "happy", "dsa32"});
    System.out.println(stringBox);
    
  }
}
