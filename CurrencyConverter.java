import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");

        System.out.print("Choose conversion option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = amount * 83.0; // 1 USD = 83 INR
                System.out.println(amount + " USD = " + result + " INR");
                break;

            case 2:
                result = amount / 83.0;
                System.out.println(amount + " INR = " + result + " USD");
                break;

            case 3:
                result = amount * 90.0; // 1 EUR = 90 INR
                System.out.println(amount + " EUR = " + result + " INR");
                break;

            case 4:
                result = amount / 90.0;
                System.out.println(amount + " INR = " + result + " EUR");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
