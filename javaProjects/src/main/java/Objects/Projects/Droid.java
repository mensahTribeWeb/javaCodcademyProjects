package Objects.Projects;

// Instances/Properties
public class Droid {
    // Instances/Properties
    int batteryLevel;
    String name;

    //Constructor
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    //Method
    public  String toString() {
        return "Hello, I'm the droid: " + name;
    }


    public  void energyTransfer(int batteryExchangeAmount, Droid name){
        System.out.println(name + "! currently  transferring: " + batteryExchangeAmount +"% to you.\n");
        System.out.println(" your battery level is currently "+name.batteryLevel+"%");
        name.batteryLevel+=batteryExchangeAmount;
        System.out.println("Your current battery level after the transfer is now: " + batteryLevel+"%");
    }
    public  void energyReport(){
        System.out.println("your current battery level:" + (batteryLevel));
    }
    public  void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel-=10;
       energyReport();
    }

    public static void main(String[] args){
        Droid droid = new Droid("Codey");
        System.out.println(droid + "\n");
        droid.performTask("dancing\n");

        Droid droid2 = new Droid("jedi");
        System.out.println(droid2 + "\n");
        droid2.energyTransfer(10, droid);

    }
}