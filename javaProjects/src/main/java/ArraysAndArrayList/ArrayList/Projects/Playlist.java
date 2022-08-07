package ArraysAndArrayList.ArrayList.Projects;

import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        //create an ArrayList
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

        //adding favorite songs to the array
        desertIslandPlaylist.add("Redemption Songs by Bob Marley");
        desertIslandPlaylist.add("That's Life by Frank Sinatra");
        desertIslandPlaylist.add("The Bare Necessities by Terry Gilkyson");
        desertIslandPlaylist.add("Drama by Erykah Badu");
        desertIslandPlaylist.add("Electric Relaxation by A Tribe Called Quest");

        //Checking Arraylist
        System.out.println(desertIslandPlaylist);

        //remove if greater than 5
        //desertIslandPlaylist.remove("name of the song");

        //check size
        System.out.println(desertIslandPlaylist.size());

        //swapSong

        //Get the indices of the songs you want to swap.
        int indexA = desertIslandPlaylist.indexOf("That's Life by Frank Sinatra");
        int indexB = desertIslandPlaylist.indexOf("Drama by Erykah Badu");

        //Create a temporary variable to store the value of song a. (We’ll call the songs a and b here.)
        String temp = "Thats Life by Frank Sinatra";

        //Rewrite the value at the index of a to the value of b.
        desertIslandPlaylist.set(indexA, "Drama by Eryka Badu");

        //Rewrite the value at the index of b to the value of the temporary variable.
        desertIslandPlaylist.set(indexB, temp);
        System.out.println(desertIslandPlaylist);
    }
}
