import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

         Account bankAccount = new Account();
         
         System.out.println("Press 1 to deposit. \n Press 2 to withdraw");
         int option = sc.nextInt();
         
         switch(option) {
         case 1:
        	 System.out.println("Please enter the amount you wish to deposit:");
        	 double amt = sc.nextDouble();
        	 bankAccount.deposit(amt);
        	 break;
         case 2:
        	 System.out.println("Please enter the amount you wish to withdraw:");
        	 double amount = sc.nextDouble();
        	 bankAccount.withdraw(amount);
        	 break;
        	 
         }
        	 
         
         
         
	}

}
