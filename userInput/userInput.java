
// import util package which contains scanner class
import java.util.*;
// while((answer!= hp)||(answer))
public class userInput {
    public static void main(String args[]) {
        while (true) {
            String hp = "Harry Potter";
            String got = "Game of Thrones";
            Double price1 = 5.0;
            Double price2 = 10.0;
            Boolean isEligible = false;
            Double totalPrice;
            int numTix;
            // declare scanner
            Scanner input = new Scanner(System.in);

            // declare name variable ask scanner to read input and assign to name
            System.out.print("What movie would you like to see: ");
            String name = input.nextLine();
            System.out.println("You Entered: " + name);
            if (name.equalsIgnoreCase(hp)) {
                System.out.println("The price for this movie is" + " " + price1);
                isEligible = true;
            } else if (name.equalsIgnoreCase(got)) {
                System.out.print("Enter your age: ");
                int i = input.nextInt();
                System.out.println("Age: " + i);
                if (i >= 18) {
                    System.out.println("The price for this movie is " + price2);
                    isEligible = true;
                } else {
                    System.out.println("you're not old enough for this movie");
                }

            } else if (name.equalsIgnoreCase("exit")) {
                input.close();
                System.exit(0);
            } else if ((name != hp) && (name != got)) {
                System.out.println("Ah jeez man, we're not showing that movie tonight");
            }

            if ((isEligible == true) && (name.equalsIgnoreCase(hp))) {
                System.out.println("How many tickets would you like ?");
                numTix = input.nextInt();
                totalPrice = numTix * price1;
                System.out.println("The total price for this order is: " + totalPrice);
            } else if ((isEligible == true) && (name.equalsIgnoreCase(got))) {
                System.out.println("How many tickets would you like ?");
                numTix = input.nextInt();
                totalPrice = numTix * price2;
                System.out.println("The total price for this order is: " + totalPrice);

            }

        }

    }
}