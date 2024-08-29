package exercises;

import java.util.Random;

public class ElBaloto {

    public static void main(String[] args){
        int userNum1 = 30;
        int userNum2 = 15;
        int userNum3 = 17;
        int userNum4 = 43;
        int userNum5 = 72;
        int userNum6 = 92;

        Random random = new Random();
        int winner1 = random.nextInt(100);
        int winner2 = random.nextInt(100);
        int winner3 = random.nextInt(100);
        int winner4 = random.nextInt(100);
        int winner5= random.nextInt(100);
        int winner6 = random.nextInt(100);

        System.out.println(winner1);
        System.out.println(winner2);
        System.out.println(winner3);
        System.out.println(winner4);
        System.out.println(winner5);
        System.out.println(winner6);

        if((userNum1 == winner1 || userNum1 == winner2 || userNum1 == winner3 || userNum1 == winner4 || userNum1 == winner5 || userNum1 == winner6)){
            System.out.println("Eres el feliz ganador");
        } else{
            System.out.println("Sigue intentando");
        }
    }

}
