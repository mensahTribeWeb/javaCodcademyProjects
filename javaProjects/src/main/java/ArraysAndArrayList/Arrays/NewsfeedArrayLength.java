package ArraysAndArrayList.Arrays;

public class NewsfeedArrayLength {

        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        int[] views = {0, 0, 0, 0};

        public NewsfeedArrayLength(){

        }

        public String[] getTopics(){
            return topics;
        }

        public int getNumTopics(){
        return topics.length;
        }

        public static void main(String[] args){
            NewsfeedArrayLength sampleFeed = new NewsfeedArrayLength();

            System.out.println("The number of topics is "+ sampleFeed.getNumTopics());

        }
}
