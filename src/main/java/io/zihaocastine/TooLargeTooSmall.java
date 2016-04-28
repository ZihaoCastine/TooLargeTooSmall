package io.zihaocastine;
/**
 * Created by zihaocastine on 4/28/16.
 */
import java.util.*;
public class TooLargeTooSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNum = (int)((Math.random()*100)+1);
        int guessNum;
        Count c=new Count();

        System.out.println("Guess the number for 1 to 100");

        System.out.print("Enter a number: ");
        guessNum = input.nextInt();
        c.addCounter(guessNum);

        while (!(guess(guessNum, secretNum))){
            System.out.print("Enter a number: ");
            guessNum = input.nextInt();
            c.addCounter(guessNum);
        }
        System.out.println("Yeah you guess the right number with "+c.counter+" tries");

    }
    static class Count{
        int counter;
        int past=-1;
        Count(){
        }

        public void addCounter(int counter) {
            if(counter!=past){
                this.counter++;
                past=counter;
            }

        }
    }

    public static boolean guess(int guessNum, int ans){
        if(guessNum==ans) {
            return true;
        }else if(guessNum> ans){
            System.out.println("Number is too larger");
        }else{
            System.out.println("Number is too small");
        }
        return false;

    }

}