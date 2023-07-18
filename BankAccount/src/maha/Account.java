package maha;

import java.time.LocalDate;

public class Account {

    int accountNo;

    LocalDate openedDate ;

    double balance;


    public Account() {}

    public Account(int accountNo, LocalDate openedDate, double balance) {

        this.accountNo = accountNo;

        this.openedDate = openedDate;

        this.balance = balance;



    }

    public int getAccountNo() {

        return accountNo;

    }

    public void setAccountNo(int accountNo) {

        this.accountNo = accountNo;

    }

    public LocalDate getOpenedDate() {

        return openedDate;

    }

    public void setOpenedDate(LocalDate openedDate) {

        this.openedDate = openedDate;

    }

    public double getBalance() {

        return balance;

    }

    public void setBalance(double balance) {

        this.balance = balance;

    }

   

    

    

}

 