import java.util.ArrayList;

public class CafeUtil{

    // int getStreakGoal()
    public int getStreakGoal() {
        int sum = 0;
        for (int drinks=0; drinks<=10; drinks++ ) {
            sum += drinks;
        }
        return sum;
    }

    //double getOrderTotal(double[] prices)
    public double getOrderTotal(double[] prices) {
        double totalOrder = 0;
        for (int i = 0; i<prices.length; i++) {
            totalOrder = totalOrder + prices[i];
        }
        return totalOrder;
    }

    // void displayMenu(ArrayList<String> menuItems)
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i<menuItems.size(); i++) {
            System.out.printf("%s %s\n" , i , menuItems.get(i));
        }
        
    }

    // addCustomer(ArrayList<String> customers)
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name.");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName);
        System.out.printf("There are %s people in front of you", customers.size() );
        customers.add(userName);
    }

    // void printPriceChart(String product, double price, int maxQuantity)
    public void printPriceChart(String product, double price, int maxQuantity) {
        for (int i = 1; i <= maxQuantity; i ++ ) {
            System.out.printf("%s - $%.2f\n", i, i * price);
        }
        System.out.println("");
    }
}

