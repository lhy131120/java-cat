package guisystem;

public class AbstractFactory {
  public static void main(String[] args) {

    String osTypeInput = "MACOS";

    try {
      /*
       * Method get from enum
       */
      OSType osType = OSType.customMethod(osTypeInput);
      GUIFactory factory = osType.geFactory();

      /*
       * Create items
       */
      Button button = factory.createButton();
      TextField textField = factory.createTextField();

      /*
       * Render items
       */
      button.render();
      textField.render();
      
    } catch (IllegalArgumentException e) {
      // TODO: handle exception
      System.err.println(e.getMessage());
    }


  }
}
