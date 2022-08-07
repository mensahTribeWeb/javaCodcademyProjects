package ControlsAndConditionals.Flow;
/**
 *Conditional statements add branching paths to our programs.
 * We use conditionals to make decisions in the program so that
 * different inputs will produce different results.
 * */
public class OrderReveiw {
    boolean isFilled;
    double billAmount;
    String shipping;

    public OrderReveiw(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        } else {
            System.out.println("Low value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
        } else {
            System.out.println("Order not ready");
        }

        double shippingCost = calculateShipping();

        System.out.println("Shipping cost: ");
        System.out.println(shippingCost);
    }

    public double calculateShipping() {
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }

    public static void main(String[] args) {
        // create instances and call methods here!
        OrderReveiw java = new OrderReveiw(true,8.99,"Express");
        java.ship();
    }
}


