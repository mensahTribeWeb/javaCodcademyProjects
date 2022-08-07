package MANIPULATINGVARIABLES;

/**
 * You are trying to split up students into groups of 3.
 * How many students will be left out once the groups are made?
 * */

public class Modulo {
    public static void main(String[] args) {
        int students = 26;
        int leftOut = students % 3;
        System.out.println(leftOut);
    }
}
