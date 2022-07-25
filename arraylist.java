import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(5);
        number.add(2);
        number.add(1,10);
        number.set(0, 3);

        for (int i = 0; i < number.size(); i++) {

            System.out.println(" " + number.get(i));
        }
    }
}

