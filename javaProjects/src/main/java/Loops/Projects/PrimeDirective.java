package Loops.Projects;

/**
 * The Prime Directive
 *
 *  A prime number is an integer greater than 1 that
 *  is only divisible by 1 and itself.
 *
 * */
import java.util.ArrayList;

class PrimeDirective {
    // Add your methods here:
public boolean isPrime(int number){
    for (int i =2; i<= number/2; i++){
    if (number % i == 0){
        return false;
    }
    }
    return true;
}
public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<>();
    for (int number : numbers) {
        if (isPrime(number)) {
            primes.add(number);
        }
    }
    return primes;
}

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

       //verify an integer
        System.out.println(pd.isPrime(6));
        System.out.println(pd.isPrime(29));
        System.out.println(pd.isPrime(28));
        System.out.println(pd.isPrime(33));
        System.out.println(pd.isPrime(11));
        System.out.println(pd.isPrime(100));
        System.out.println(pd.isPrime(101));
        System.out.println(pd.isPrime(43));
        System.out.println(pd.isPrime(89));

        //returns prime numbers from an array of numbers
        System.out.println(pd.onlyPrimes(numbers));
    }

}