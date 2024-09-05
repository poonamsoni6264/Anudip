package Bank_Problem;

public class Bank_Class {
    // Instance variable 
    private double amount;

    //  constructor 
    public Bank_Class(double amount) {
        this.amount = amount;
    }
 
    // Function
    public void withdraw(double withdrawalAmount) {
        //  ternary operator 
        String result = (withdrawalAmount <= amount) ? "Withdraw successful" : "Insufficient funds";
        System.out.println(result);
        
        // Update the balance if the withdrawal was successful
        amount = (withdrawalAmount <= amount) ? amount - withdrawalAmount : amount;
    }

    // Function to deposit amount to the bank account
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // Function to display the total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    // Main method to test the Bank class
    public static void main(String[] args) {
        // Creating an object of Bank with initial balance 10000
        Bank_Class account = new Bank_Class(10000);

        //  withdraw 3000
        account.withdraw(3000);

        // Depositing 5000 to the account
        account.deposit(5000);

        // Displaying the final balance
        account.displayBalance();
    }
}

