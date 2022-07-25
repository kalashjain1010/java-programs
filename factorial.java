import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();

        double factorial =1;
        for(double i =a;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}