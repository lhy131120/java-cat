package transportSystem;

public class Airplane implements Transport {
  @Override
  public void deliver() {
    System.out.println("Delivering by air using an airplane.");
  }
}
