public class overloaded {
    public static void main(String[] args){
    
    int z = add(2,3,4);
     System.out.print(z); 
    }

    static int add(int a, int b){ 
        System.out.println("this is 1st method");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("this is 1st method");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("this is 1st method");
        return a+b+c+d;
    }
}
