package Variables.Projects;

import java.util.Scanner;

public class MadLibs {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
  Java Variables: Mad Libs
In this project, we’ll use Java to write a Mad Libs word game! Mad Libs have short
stories with blank spaces that a player can fill in. The result is usually funny (or strange).

  */
        System.out.println("Please enter the main Characters name: ");
        String name1 = scan.nextLine();

        System.out.println("Please your another character name: ");
        String name2 = scan.nextLine();

        System.out.println("Please enter an adjective: ");
        String adjective1 = scan.nextLine();

        System.out.println("Please enter an adjective: ");
        String adjective2 = scan.nextLine();

        System.out.println("Please enter an adjective: ");
        String adjective3 = scan.nextLine();

        System.out.println("Please enter a noun: ");
        String noun1 = scan.nextLine();

        System.out.println("Please enter a noun: ");
        String noun2 = scan.nextLine();

        System.out.println("Please enter a noun: ");
        String noun3 = scan.nextLine();

        System.out.println("Please enter a noun: ");
        String noun4 = scan.nextLine();

        System.out.println("Please enter a noun: ");
        String noun5 = scan.nextLine();

        System.out.println("Please enter a noun: ");
        String noun6 = scan.nextLine();

        System.out.println("Please enter a verb: ");
        String verb1 = scan.nextLine();

        System.out.println("Please enter a country, city, town, planet: ");
        String place1 = scan.nextLine();

        System.out.println("Please enter a number(year): ");
        int number = scan.nextInt();
        scan.nextLine();


            //The template for the story
            String story = "This morning " + name1 + " woke up feeling "+adjective1+". 'It is going to be a " + adjective2
                    + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores.\n They began to "
                    + verb1 + " to the rhythm of the "+ noun3 + ", which made all the " + noun4 + "s very " + adjective3
                    + ". \nConcerned, " + name1 + " texted " + name2 +", who flew "+name1+" to "+place1+" and dropped \n"
                    +name1 +" in a puddle of frozen "+noun5+". \n"+ name1 +" woke up in the year "+ number
                    +", in a world where "+ noun6 +"s ruled the world.";
        System.out.println(story);
        }
    }

