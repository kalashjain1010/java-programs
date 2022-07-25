import java.util.*;

public class NEW {
    public static void main(String[] args) {
        System.out.println("enter a no.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 50 || a < 10) {
            System.out.println("out of range");
        } else {
            System.out.println(a * a);
        }
    }
}
