import java.util.Scanner;

public class ATM {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Create a new ATM object
        ATM atm = new ATM();

        // Start the ATM
        atm.start();
    }

    private void start() {

        // Display a welcome message
        System.out.println("Welcome to the ATM!");

        // Prompt the user to enter their account number
        System.out.println("Please enter your account number:");
        String accountNumber = scanner.nextLine();

        // Prompt the user to enter their PIN
        System.out.println("Please enter your PIN:");
        String pin = scanner.nextLine();

        // Authenticate the user
        boolean authenticated = authenticateUser(accountNumber, pin);

        // If the user is authenticated, display the main menu
        if (authenticated) {
            mainMenu();
        } else {
            // Display an error message and exit the ATM
            System.out.println("Invalid account number or PIN. Please try again.");
            System.exit(0);
        }
    }

    private boolean authenticateUser(String accountNumber, String pin) {

        // TODO: Implement this method to authenticate the user
        // For example, you could check the account number and PIN against a database of users

        return true;
    }

    private void mainMenu() {

        // Display the main menu options
        System.out.println("Main Menu:");
        System.out.println("1. Withdraw cash");
        System.out.println("2. Deposit cash");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");

        // Prompt the user to select an option
        System.out.println("Please select an option:");
        int option = scanner.nextInt();

        // Handle the user's selection
        switch (option) {
            case 1:
                withdrawCash();
                break;
            case 2:
                depositCash();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    private void withdrawCash() {

        // TODO: Implement this method to allow the user to withdraw cash
        // For example, you could prompt the user to enter the amount they want to withdraw and then update the user's balance accordingly

        System.out.println("How much cash would you like to withdraw?");
        

        // TODO: Withdraw the cash from the ATM

        System.out.println("Please take your cash.");
    }

    private void depositCash() {

        // TODO: Implement this method to allow the user to deposit cash
        // For example, you could prompt the user to enter the amount they want to deposit and then update the user's balance accordingly

        System.out.println("How much cash would you like to deposit?");
        

        // TODO: Deposit the cash into the ATM

        System.out.println("Thank you for your deposit.");
    }

    private void checkBalance() {

        // TODO: Implement this method to display the user's balance
        // For example, you could retrieve the user's balance from the database and then display it to the user

        System.out.println("Your current balance is: $" + getBalance());
    }

    private void exit() {

        // TODO: Implement this method to exit the ATM
        // For example, you could close the database connection and then exit the program

        System.out.println("Thank you for using the ATM. Goodbye!");
        System.exit(0);
    }

    private double getBalance() {

        // TODO: Implement this method to retrieve the user's balance from the database

        return 100.00;
    }
}