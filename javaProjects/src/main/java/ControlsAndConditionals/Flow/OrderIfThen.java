package ControlsAndConditionals.Flow;
/**
 * If-Then-Else
 *
 * if (hasPrerequisite) {
 *
 *   // Enroll in course
 *
 * } else {
 *
 *   // Enroll in prerequisite
 *
 * }
 * */
public class OrderIfThen {
    public static void main(String[] args) {
        boolean isFilled = true;
        if(isFilled){
            System.out.println("Shipping");
        }
        else{
            System.out.println("Order not ready");
        }

    }
}
