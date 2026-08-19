
import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String bankName = sc.nextLine();

        System.out.print("Enter user ID: ");
        int userId = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter user name: ");
        String userName = sc.nextLine();

        System.out.print("Enter account number: ");
        long accountNumber = sc.nextLong();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter account type: ");
        String accountType = sc.nextLine();

        System.out.print("Enter opening balance: ");
        double openingBalance = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        Bank b = new Bank(bankName, userId, userName, accountNumber, accountType, openingBalance);

        int choice;
        double amount;
        boolean status;

        do {
            System.out.println("\n1. Display Complete Details");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Summary");
            System.out.println("6. Check Minimum Balance");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    b.displayBankDetails();
                    b.displayUserDetails();
                    b.displayAccountDetails();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();

                    status = b.deposit(amount);

                    if (status) {
                        System.out.println("Deposit successful.");
                        System.out.println("Updated Balance: " + b.checkBalance());
                    } else {
                        System.out.println("Deposit failed.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();

                    status = b.withdraw(amount);

                    if (status) {
                        System.out.println("Withdrawal successful.");
                        System.out.println("Updated Balance: " + b.checkBalance());
                    } else {
                        System.out.println("Withdrawal failed.");
                    }
                    break;

                case 4:
                    System.out.println("Current Balance: " + b.checkBalance());
                    break;

                case 5:
                    System.out.println(b.createAccountSummary());
                    break;

                case 6:
                    System.out.print("Enter minimum balance to check: ");
                    double minBal = sc.nextDouble();

                    status = b.hasMinimumBalance(minBal);

                    if (status) {
                        System.out.println("Minimum balance is maintained.");
                    } else {
                        System.out.println("Minimum balance is not maintained.");
                    }
                    break;

                case 0:
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
