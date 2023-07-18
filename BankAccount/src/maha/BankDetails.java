package maha;
import java.time.LocalDate;
public class BankDetails 
{ 
    public static void main(String[] args) 
    {
    	Bank b =  new Bank("SBI","HYDERABAD");
      Account a1 = new SavingsAccount(101,LocalDate.now(),500.5,750.5,10);
      Account a2 =  new CurrentAccount(102,LocalDate.now(),75.5,500);
      b.addAccount(a1);
      b.addAccount(a2);
      b.showAccounts();
      SavingsAccount s = new SavingsAccount();
      System.out.println(b.transaction('w', 101, 500.5, a1, s));
    }
    
}