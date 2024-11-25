package transportSystem;

public class Train implements Transport{
  @Override
  public void deliver() {
    System.out.println("Delivering by land using a train.");
  }
}
