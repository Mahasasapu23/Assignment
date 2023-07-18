package maha;

import java.util.Scanner;

public class Bank {

    private String bankName;

    private String branchName;

    private Account[] accounts ;

    private int index = 0;

    public Bank() {}

    public Bank(String bankName, String branchName) {

        this.bankName = bankName;

        this.branchName = branchName;
        this.accounts = new Account[10];

    }

    public String getBankName() {

        return bankName;

    }

    public void setBankName(String bankName) {

        this.bankName = bankName;

    }

    public String getBranchName() {

        return branchName;

    }

    public void setBranchName(String branchName) {

        this.branchName = branchName;

    }

    public boolean addAccount(Account account)

    {
    	if(account instanceof SavingsAccount || account instanceof CurrentAccount)
    	{
    		accounts[index]= account;
    		index++;
    		return true;
    	}
        throw new RuntimeException("No more accounts can be added");

    }

    public void showAccounts() {

        for(int i=0;i<index;i++)

        {

            System.out.println("Account no:"+accounts[i].getAccountNo());

            System.out.println("OpenedDate:"+accounts[i].getOpenedDate());

            System.out.println("Balance:"+accounts[i].getBalance());
        }

    }

    

    public boolean transaction(char ttype,int accountNo,double amount,Account a,SavingsAccount s)  
    {
          if(ttype == 'd')
          {

              a.setBalance(a.getBalance()+amount);
              return true;    //a.getBalance();
          }
          else if(ttype == 'w')
          {
              if(a.getBalance()-amount >= s.getMinimumDepositAmount())
              {
                  return true;
              }//a.getBalance();
              else
                  throw new InsufficientBalanceException("No minimum deposit amount");
          }
          return false;
    }


}