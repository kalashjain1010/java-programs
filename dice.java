import java.util.Random;

public class dice { 
    dice(){
        Random random = new Random();
        int num = 0;
        baka(random, num);
    }

    void baka(Random random,int num){
        num = random.nextInt(6)+1;
        System.out.println("your random no. is "+num);

    }
}
