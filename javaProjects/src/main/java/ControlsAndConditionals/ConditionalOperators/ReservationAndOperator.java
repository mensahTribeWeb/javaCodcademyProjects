package ControlsAndConditionals.ConditionalOperators;

public class ReservationAndOperator {
    /*
write conditional
       ~~~~~~~~~~~~~~~~~
       if restaurantCapacity is greater
       or equal to guestCount
       AND
       the restaurant is open:
         print "Reservation confirmed"
         set isConfirmed to true
       else:
         print "Reservation denied"
         set isConfirmed to false
    */


        int guestCount;
        int restaurantCapacity;
        boolean isRestaurantOpen;
        boolean isConfirmed;

        public ReservationAndOperator(int count, int capacity, boolean open) {
            guestCount = count;
            restaurantCapacity = capacity;
            isRestaurantOpen = open;
        }

        public void confirmReservation() {
            if(restaurantCapacity >= guestCount && isRestaurantOpen){
                System.out.println("Reservation confirmed");
                isConfirmed = true;
            }
            else{
                System.out.println("Reservation denied");
                isConfirmed = false;
            }
        }

        public void informUser() {
            System.out.println("Please enjoy your meal!");
        }

        public static void main(String[] args) {
            ReservationAndOperator partyOfThree = new ReservationAndOperator(3, 12, true);
            ReservationAndOperator partyOfFour = new ReservationAndOperator(4, 3, true);
            partyOfThree.confirmReservation();
            partyOfThree.informUser();
            partyOfFour.confirmReservation();
            partyOfFour.informUser();
        }
    }

