
class Bank {

    String bankName;
    int userId;
    String userName;
    long accountNumber;
    double balance;

    Bank(String bankName, int userId, String userName, long accountNumber, double balance) {
        this.bankName = bankName;
        this.userId = userId;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayBankDetails() {
        System.out.println("Bank Name : " + bankName);
    }

    void displayUserDetails() {
        System.out.println("User ID : " + userId);
        System.out.println("User Name :" + userName);
    }

    void displayAccountDetails() {
        System.out.println("Account Number :" + accountNumber);
        System.out.println("Account type :" + accountType);
        System.out.println("CurrentBalance : " + balance);
    }

    String accountSummary() {
        String accountSummary = "Bank name : " + bankName + "\nUser name: " + userName + "\nAccount number :" + accountNumber + "\nCurrent balance :" + balance;
        return accountSummary;
    }

    boolean hasMinimumBalance(double minimumBalance) {
        boolean res = false;
        if (balance >= minimumBalance) {
            return res = true;
        } else {
            return res;
        }
    }
}
