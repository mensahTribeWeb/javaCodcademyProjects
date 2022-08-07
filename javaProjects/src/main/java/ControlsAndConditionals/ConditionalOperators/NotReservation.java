package ControlsAndConditionals.ConditionalOperators;

/**
 * Logical NOT: !
 * The unary operator NOT, !, works on a single value.
 * This operator evaluates to the opposite boolean to which it’s applied:
 * */

public class NotReservation {

        int guestCount;
        int restaurantCapacity;
        boolean isRestaurantOpen;
        boolean isConfirmed;

        public NotReservation(int count, int capacity, boolean open) {
            if (count < 1 || count > 8) {
                System.out.println("Invalid reservation!");
            }
            guestCount = count;
            restaurantCapacity = capacity;
            isRestaurantOpen = open;
        }

        public void confirmReservation() {
            if (restaurantCapacity >= guestCount && isRestaurantOpen) {
                System.out.println("Reservation confirmed");
                isConfirmed = true;
            } else {
                System.out.println("Reservation denied");
                isConfirmed = false;
            }
        }

        public void informUser() {
            // Write conditional here
            if(!isConfirmed){
                System.out.println("Unable to confirm reservation, please contact restaurant.");
            }
            else{
                System.out.println("Please enjoy your meal!");
            }

        }



        public static void main(String[] args) {
            NotReservation partyOfThree = new NotReservation(3, 12, true);
            NotReservation partyOfFour = new NotReservation(4, 3, true);
            partyOfThree.confirmReservation();
            partyOfThree.informUser();
            partyOfFour.confirmReservation();
            partyOfFour.informUser();
        }
    }

    /**
     * Output:
     * Reservation confirmed
     * Please enjoy your meal!
     * Reservation denied
     * Unable to confirm reservation, please contact restaurant.
     * */

