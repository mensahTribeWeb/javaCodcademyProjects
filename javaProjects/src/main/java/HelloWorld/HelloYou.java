package HelloWorld;

import java.util.Scanner;
public class HelloYou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
    }
}
