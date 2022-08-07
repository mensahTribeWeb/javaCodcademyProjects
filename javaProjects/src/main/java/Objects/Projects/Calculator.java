package Objects.Projects;

    /**
     * A basic calculator project to practice:
     * Objects
     * Methods
     * Constructors
     * Variables
     * Parameters
     * */
    public class Calculator{

        //properties/Instances
         int num0;
         int num1;

        //Constructor
        public Calculator(){}

        //method
        public int add(int num0, int num1){
            return num0 + num1;
        }
        public  int subtract(int num0, int num1){
            return num0 - num1;
        }
        public int multiply(int num0, int num1){
            return num0 * num1;
        }
        public int divide(int num0, int num1){
            return num0 / num1;
        }
        public int modulo(int num0, int num1){
            return num0 % num1;
        }

        public static void main(String[] args){
            Calculator calculator = new Calculator();
            System.out.println(calculator.add(5,7));
            System.out.println(calculator.subtract(45,11));

        }
    }

