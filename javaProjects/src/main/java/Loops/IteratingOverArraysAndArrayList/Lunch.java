package Loops.IteratingOverArraysAndArrayList;

/**
 * Removing Elements During Traversal
 * */

import java.util.ArrayList;

public class Lunch {

    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        // Add your code below
        for (int i = 0; i < lunchBox.size(); i++) {
            if (lunchBox.get(i).equals("ant")) {
                lunchBox.remove(lunchBox.get(i));
                i--;
            }
        }

         /*
    // Using a while loop
    int i = 0;
    while (i < lunchBox.size()) {
      if (lunchBox.get(i).equals("ant")){
        lunchBox.remove(lunchBox.get(i));
      } else {
        i++;
      }
    }
   */
            return lunchBox;
        }


        public static void main (String[]args){
            ArrayList<String> lunchContainer = new ArrayList<>();
            lunchContainer.add("apple");
            lunchContainer.add("ant");
            lunchContainer.add("ant");
            lunchContainer.add("sandwich");
            lunchContainer.add("ant");
            lunchContainer = removeAnts(lunchContainer);
            System.out.println(lunchContainer);

        }
    }
