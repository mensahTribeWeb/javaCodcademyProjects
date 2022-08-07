package Loops.For;
/**
 * The continue keyword can be placed inside of a loop if we want to skip an iteration.
 * If continue is executed, the current loop iteration will immediately end, and the next
 * iteration will begin.
 * */
public class Numbers {
    public static void main(String[] args) {
        //The only numbers that should be printed are those that are divisible by 5!
        for (int i = 5; i < 100; i++) {
            // Add your code below
        if ( !(i % 5 == 0)){
            continue;
        }
            System.out.println(i);
        }

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                continue;
            }
            System.out.println(numbers[i]);
        }
    }
}
