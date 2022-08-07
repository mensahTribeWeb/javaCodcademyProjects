package MANIPULATINGVARIABLES;
/**
 * You are also in charge of keeping track of how many cookies there are at the bake sale.
 * This value is represented by the variable numCookies.
 *
 * A customer comes and buys 3 cookies. Use the appropriate compound
 * assignment operator to reflect this change.
 *
 * Another customer buys half of the remaining cookies.
 * */
public class BakeSale {
    public static void main(String[] args) {

        int numCookies = 17;
        numCookies -= 3;

        numCookies /=2;

        // Add your code above
        System.out.println(numCookies);

    }
}
