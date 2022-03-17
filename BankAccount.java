/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into this account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
	  if(amount < 0) {
		  System.out.println("Error! Amount is not valid.");
	  }
	  
	  else {
		  balance = balance + amount;
	  }
   }

   /**
      Makes a withdrawal from this account
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {   
	   if(amount > balance) {
		   System.out.println("Error! Amount is greater than balance.");
	   }
	   else{
		   balance = balance - amount;
	   }
   }

   /**
      Gets the current balance of this account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}

