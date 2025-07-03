package saiket_Projects;


	import java.util.Scanner;

	public class SimpleBankingSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String accountHolder;
	        int accountNumber;
	        double balance = 0;

	        System.out.println("===== Welcome to Simple Bank =====");

	        System.out.print("Enter account holder name: ");
	        accountHolder = scanner.nextLine();

	        System.out.print("Enter account number: ");
	        accountNumber = scanner.nextInt();

	        int choice;
	        do {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. View Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter deposit amount: ₹");
	                    double deposit = scanner.nextDouble();
	                    if (deposit > 0) {
	                        balance += deposit;
	                        System.out.println("₹" + deposit + " deposited successfully.");
	                    } else {
	                        System.out.println("Invalid deposit amount.");
	                    }
	                    break;
	                case 2:
	                    System.out.print("Enter withdrawal amount: ₹");
	                    double withdraw = scanner.nextDouble();
	                    if (withdraw > 0 && withdraw <= balance) {
	                        balance -= withdraw;
	                        System.out.println("₹" + withdraw + " withdrawn successfully.");
	                    } else {
	                        System.out.println("Invalid or insufficient amount.");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Current balance: ₹" + balance);
	                    break;
	                case 4:
	                    System.out.println("Thank you, " + accountHolder + ". Visit again!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 4);

	        scanner.close();
	    }
	}



