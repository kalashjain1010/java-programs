import java.util.Scanner;

public class input {
    public static void main(String[] args){
    
        Scanner a = new Scanner(System.in);
        System.out.print("your name:"); 
        String name = a.nextLine();
        System.out.print("your age:"); 
        int age = a.nextInt();
    
        System.out.print("your name is "+ name+" and your age is "+age); 
    }
}
