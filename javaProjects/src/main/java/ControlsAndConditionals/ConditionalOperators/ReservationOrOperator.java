package ControlsAndConditionals.ConditionalOperators;

public class ReservationOrOperator {
    /*
In an expression that uses ||,
the resulting value will be true as long as one of the operands has a true value.
    */

        int guestCount;
        int restaurantCapacity;
        boolean isRestaurantOpen;
        boolean isConfirmed;

        public ReservationOrOperator(int count, int capacity, boolean open) {
            // Write conditional statement below

            if(count < 1 || count > 8){
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
            System.out.println("Please enjoy your meal!");
        }

        public static void main(String[] args) {
            ReservationOrOperator partyOfThree = new ReservationOrOperator(3, 12, true);
            ReservationOrOperator partyOfFour = new ReservationOrOperator(4, 3, true);
            partyOfThree.confirmReservation();
            partyOfThree.informUser();
            partyOfFour.confirmReservation();
            partyOfFour.informUser();
        }
    }

