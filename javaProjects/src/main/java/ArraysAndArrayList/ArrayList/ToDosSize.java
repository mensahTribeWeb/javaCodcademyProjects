package ArraysAndArrayList.ArrayList;
import java.util.ArrayList;
public class ToDosSize {

    public static void main(String[] args) {

        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // Print the size of each ArrayList below:
        System.out.println(sherlocksToDos.size());
        System.out.println(poirotsToDos.size());


        // Print the name of the detective with the larger to-do list:
        //So who has more to do? Print the name of the detective whose
        // to-do list is longer. Was it Sherlock or Poirot?
        if(sherlocksToDos.size()> poirotsToDos.size()){
            System.out.println("sherlocksToDos");
        }
        else{
            System.out.println("poirotsToDos");}
        }
}
