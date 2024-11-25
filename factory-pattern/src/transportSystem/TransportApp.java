package transportSystem;

public class TransportApp {
  public static void main(String[] args) {
    TransportFactory factory = new TransportFactory();

    try {
      Transport truck = factory.createTransport("Truck");
      truck.deliver();

      Transport ship = factory.createTransport("Ship");
      ship.deliver();

      Transport airplane = factory.createTransport("Airplane");
      airplane.deliver();

      Transport train = factory.createTransport("Train");
      train.deliver();

      Transport bike = factory.createTransport("Bike");
      bike.deliver();

    } catch (UnknownTransportTypeException e) {
      System.err.println(e.getMessage());
    }
  }
}
