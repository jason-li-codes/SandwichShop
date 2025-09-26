import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
                """
                        Welcome to my sandwich shop!
                        Please pick a sandwich size:
                        (1) Regular: $5.45
                        (2) Large: $8.95"""
        );

        int size = input.nextInt();

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        double price = 0;

        if (size == 1) {
            price = 5.45;
        }
        else if (size == 2) {
            price = 8.95;
        }

        if (age > 65) {
            price *= 0.8;
        }
        else if (age <= 17) {
            price *= 0.9;
        }

        System.out.printf("Your total is $%.2f.", price);


    }

}
