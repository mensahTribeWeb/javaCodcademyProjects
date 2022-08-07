package ArraysAndArrayList.Arrays;
import java.util.Arrays;
public class NewsfeedArrayCreation {
    public NewsfeedArrayCreation(){

    }

    // Create getTopics() below:

    public String[] getTopics(){
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }

    public static void main(String[] args){
        NewsfeedArrayCreation sampleFeed = new NewsfeedArrayCreation();

    String[] topics = sampleFeed.getTopics();
    System.out.println(Arrays.toString(topics));

    }
}
