import java.util.Scanner;
//Michael Mallh
public class Assignment5 {

	public static void main(String[] args){
		//public class ATM
		
		BankAccount account= new BankAccount(500);
		int choice = 0;
		int count = 3;
		int pin = 1111;
		int userPin = 0; 
				
		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to SJU ATM!");
		
		do {
			System.out.println("Enter pin: ");
			userPin = in.nextInt();
			count--;
		}while(count > 0 && userPin != 1111);
		
		if(userPin == 1111) {
		
			do {
				System.out.println("Please Choose From The Following Options: ");
				System.out.println("1 - View Balance");
				System.out.println("2 - Make A Deposit");
				System.out.println("3 - Withdraw Cash");
				System.out.println("4 - Exit");
				choice = in.nextInt();
			
				switch(choice) {
					case 1:
						System.out.println("Your Balance Is: " + account.getBalance());
						break;
				
					case 2:
						int deposit = 0;
						System.out.println("Enter Amount To Deposit: ");
						deposit = in.nextInt();
						account.deposit(deposit);
						System.out.println("Your Updated Balance Is: " + account.getBalance());
						break;
					
					case 3:
						int withdraw = 0;
						System.out.println("Enter Amount To Withdraw: ");
						withdraw = in.nextInt();
						account.withdraw(withdraw);
						System.out.println("Your Updated Balance Is: " + account.getBalance());
						break;
					
					case 4:
						System.out.println("Thank you... Exiting program");
						break;
				
					default:
						System.out.println("Invalid Choice.");
					}	
				} while(choice != 4);

				}
				else {
					System.out.println("Please Try Again Later! Too Many Attempts!");
				}

		}
}