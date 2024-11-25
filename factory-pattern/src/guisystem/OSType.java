package guisystem;

public enum OSType {
  WINDOWS(new WindowsFactory()),
  MACOS(new MacOSFactory()),;

  private final GUIFactory factory;

  // 枚舉構造函數，綁定對應工廠
  OSType(GUIFactory factory) {
    this.factory = factory;
  }

  // 提供獲取工廠的方法
  public GUIFactory geFactory() {
    return factory;
  }

  public static OSType customMethod(String osType) {
    for (OSType type : values()) {
      if(type.name().equalsIgnoreCase(osType)){
        return type;
      }
    }
    throw new IllegalArgumentException("Unknow os type: " + osType);
  }

}
