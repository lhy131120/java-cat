import java.util.ArrayList;
import java.util.List;

public class GenericAndListDemo {
  public static<T> List<String> convertToStringList(List<T> inputList) {
    List<String> stringList = new ArrayList<>();
    for (T element : inputList) {
      stringList.add(element.toString());
    }
    return stringList;
  }

  public static void main(String[] args) {
    List<Integer> intList = List.of(1,2,3,4,5);
    List<String> stringListFromInt = convertToStringList(intList);
    System.out.println("Integer List to String List: " + stringListFromInt);

    List<String> strList = List.of("Alice", "Johnny", "Cobi");
    List<String> stringListFromStr = convertToStringList(strList);
    System.out.println("String List to String List: " + stringListFromStr);

    List<Person> personList = List.of(new Person( "Alice", 12), new Person("Agness", 70));
    List<String> stringListFromPerson = convertToStringList(personList);
    System.out.println("Person List to String List: " + stringListFromPerson);
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return name + " (" + age + ")";
  }
}


