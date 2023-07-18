package maha;

import java.time.LocalDate;

public class CurrentAccount extends Account{

    double overDraftLimit;

 

    public CurrentAccount() {}

 

    public CurrentAccount(int accountNo, LocalDate openedDate, double balance,double overDraftLimit) {
    	super(accountNo,openedDate,balance);
        this.overDraftLimit = overDraftLimit;

    }

 

    public double getOverDraftLimit() {

        return overDraftLimit;

    }

 

    public void setOverDraftLimit(double overDraftLimit) {

        this.overDraftLimit = overDraftLimit;

    }

    public double validateOverDraftLimit(double OverDraftLimit) {

        if(OverDraftLimit > 0)

            return OverDraftLimit;

        throw new RuntimeException("No OverDraftLimit");

    }

}