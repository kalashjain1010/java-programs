import java.util.Scanner;

public class fibunachi {
    public static void main(String[] args) {
        System.out.print("enter a no.: ");
        Scanner g = new Scanner(System.in);
        int n= g.nextInt();
        
        int a=0,b=1,c;
        System.out.print(a+" ");
        System.out.print(b+ " ");

        for (int i = 0; i <n-2; i++){
           c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
}

