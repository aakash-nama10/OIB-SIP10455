import java.util.Scanner;

public class AtmInterface {
    public static void main(String args[]) {
        int balance = 5000, withdraw, deposit, Money;
        Scanner atm = new Scanner(System.in);
        while (true) {

            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Transfer");
            System.out.println("Choose 5 for EXIT");
            int n = atm.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = atm.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = atm.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Enter the Money to be transmitted: ");
                    Money = atm.nextInt();
                    System.out.println("Your Money is Transfered");
                    break;

                case 5:
                    System.out.println("    THANK YOU    ");
                    System.out.println("      VISIT AGAIN     ");
            }
        }
    }
}
