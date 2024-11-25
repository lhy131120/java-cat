package transportSystem;

public class TransportFactory {
  
  public Transport createTransport(String type) throws UnknownTransportTypeException {
    try {
      TransportType transportType = TransportType.valueOf(type.toUpperCase());
      return transportType.createTransport();
    } catch (IllegalArgumentException e) {
      throw new UnknownTransportTypeException("Unknown transport type: " + type);
    }
  }
}
