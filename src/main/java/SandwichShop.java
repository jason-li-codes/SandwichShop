import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // new scanner system
        Scanner input = new Scanner(System.in);

        // intro to pick sandwich size
        System.out.println(
                """
                        Welcome to my sandwich shop!
                        Please pick a sandwich size:
                        (1) Regular: $5.45
                        (2) Large: $8.95"""
        );

        int size = input.nextInt();

        // asks if they want sandwich "loaded"
        System.out.println("Would you like to supersize that? Y/N");
        String supersizeStr = input.next();
        char supersizeChar = Character.toLowerCase(supersizeStr.charAt(0));

        // asks for age
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        // starts with empty variable
        double price = 0;

        // sets price based on size
        if (size == 1) {
            price = 5.45;
        }
        else if (size == 2) {
            price = 8.95;
        }
        // if they don't input correctly, they get a large
        else {
            System.out.println("Guess that's a Large!");
            price = 8.95;
        }

        // if they didn't select no, they get a "loaded" sandwich
        if (supersizeChar != 'n' && size == 1)
        {
            price += 1;
        }
        else if (supersizeChar != 'n' && size == 2)
        {
            price += 1.75;
        }

        // applies discount after everything else
        if (age > 65) {
            price *= 0.8;
        }
        else if (age <= 17) {
            price *= 0.9;
        }

        // outputs price as a price with 2 decimal places
        System.out.printf("Your total is $%.2f.", price);


    }

}
