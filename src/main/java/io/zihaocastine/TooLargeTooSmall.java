package io.zihaocastine; /**
 * Created by zihaocastine on 4/28/16.
 */
import java.util.*;
public class TooLargeTooSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNum = (int)((Math.random()*100)+1);
        int guessNum;
        System.out.println("Guess the number for 1 to 100");

            System.out.print("Enter a number: ");
            guessNum = input.nextInt();
        while (!(guess(guessNum, secretNum))){
            System.out.print("Enter a number: ");
            guessNum = input.nextInt();
        }
        System.out.println("Yeah you guess the right number");

    }
    public static boolean guess(int guess, int ans){
        if(guess==ans) {
            return true;
        }else if(guess> ans){
            System.out.println("Number is too larger");
        }else{
            System.out.println("Number is too small");
        }
        return false;
    }

}