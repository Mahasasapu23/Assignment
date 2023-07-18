package maha;

import java.time.LocalDate;

public class SavingsAccount extends Account {

    double minimumDepositAmount;

    int noOfTransactionsPerDay;

    public SavingsAccount() {}

    public SavingsAccount(int accountNo, LocalDate openedDate , double balance,double minimumDepositAmount, int noOfTransactionsPerDay) {
    	super(accountNo,openedDate,balance);
        this.minimumDepositAmount = minimumDepositAmount;
        this.noOfTransactionsPerDay = noOfTransactionsPerDay;

    }

    public double getMinimumDepositAmount() {

        return minimumDepositAmount;

    }

    public void setMinimumDepositAmount(double minimumDepositAmount) {

        this.minimumDepositAmount = minimumDepositAmount;

    }

    public int getNoOfTransactionsPerDay() {

        return noOfTransactionsPerDay;

    }

    public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay) {

        this.noOfTransactionsPerDay = noOfTransactionsPerDay;

    }

    public double validateMinimumDepositAmount(double minimumDepositAmount) {

        if(minimumDepositAmount > 2500.50)

                return minimumDepositAmount;

        throw new RuntimeException("Not Eligible For Bank Account opening");

    }

    public int validateNoOfTransactionsPerDay(int noOfTransactionsPerDay) {

        if(noOfTransactionsPerDay <= 20)

            return noOfTransactionsPerDay;

        throw new RuntimeException("No Of Transactions limit Crossed");

    }

}