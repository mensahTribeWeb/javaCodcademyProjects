package MANIPULATINGVARIABLES;

public class EqualNotEqual {
    public static void main(String[] args) {
        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        //First, create a variable called sameNumberOfSongs that stores whether the two albums have the same number of songs.
        boolean sameNumberOfSongs = songsA == songsB;
        System.out.println(sameNumberOfSongs);

        boolean differentLength = albumLengthA != albumLengthB;
        System.out.println(differentLength);
    }
}
