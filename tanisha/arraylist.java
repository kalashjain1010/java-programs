 import java.util.*;

public class arraylist {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    cars.set(0, "kalash");
    Collections.sort(cars);

     System.out.println(cars);

  }
}

