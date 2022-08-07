package ControlsAndConditionals.Flow;

public class OrderElseIf {
    // properties / instances
    boolean isFilled;
    double billAmount;
    String shipping;

    // constructor
    public OrderElseIf(boolean filled, double cost, String shippingMethod){
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }
    //method
    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        // declare conditional statement here
        if(shipping.equals("Regular")){
            return 0;
        }
        else if(shipping.equals("Express")){
            return 1.75;
        }
        else{return .50;}

    }

    public static void main(String[] args) {
        // do not alter the main method!
        OrderElseIf book = new OrderElseIf(true, 9.99, "Express");
        OrderElseIf chemistrySet = new OrderElseIf(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }

}
