package Loops.Projects;

/**
 * As the inventor of this challenge, Imran Ghory, states:
 *
 * “After a fair bit of trial and error I’ve come to discover that people who struggle to
 * code don’t just struggle on big problems, or even smallish problems (i.e. write an
 * implementation of a linked list). They struggle with tiny problems.
 *
 * So I set out to develop questions that can identify this kind of developer and came up
 * with a class of questions I call “FizzBuzz Questions” named after a game children often
 * play (or are made to play) in schools in the UK.”
 * */

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            if (i%3==0){
                System.out.println("Fizz");
                continue;
            }
            if (i%5==0){
                System.out.println("Buzz");
                continue;
            }
            else{
                System.out.println(i);
            }
    }

    }
}
