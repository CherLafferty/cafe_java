public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.85;
        double caramelLatte = 5.39;
        double cappuccino = 4.75;
        double totalAmount;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage + displayTotalMessage + dripCoffee);
        }
        System.out.println(customer1 + pendingMessage);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccino);
        }
        System.out.println(customer2 + pendingMessage);
        totalAmount = (2 * caramelLatte);
        System.out.println(customer2 + displayTotalMessage + totalAmount );
        totalAmount = (caramelLatte - dripCoffee);
        System.out.println(customer3 + displayTotalMessage + totalAmount );
    	// ** Your customer interaction print statements will go here ** //
    }
}
