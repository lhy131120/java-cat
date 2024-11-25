package transportSystem;

public enum TransportType {
  TRUCK {
    @Override
    public Transport createTransport() {
      return new Truck();
    }
  },
  SHIP {
    @Override
    public Transport createTransport() {
      return new Ship();
    }
  },
  AIRPLANE {
    @Override
    public Transport createTransport() {
      return new Airplane();
    }
  },
  TRAIN {
    @Override
    public Transport createTransport() {
      return new Train();
    }
  },;

  public abstract Transport createTransport();

  public static void main(String[] args) {
    for(TransportType type: TransportType.values()) {
      /**
       * TRUCK
       * SHIP
       * AIRPLANE
       * TRAIN
       */
      System.out.println(type.name());
    }
  }
}
