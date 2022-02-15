package OOPG.Week3;
import java.util.*;
import java.lang.Math;

public class loan {
    double annualInterestRate = 2.5;
    int numOfYears = 1;
    double loanAmount = 1000;
    Date loanDate =  new Date();

    loan(){}
    loan(double newIR, int newNumYear, double newLoanAmount){
        annualInterestRate = newIR;
        numOfYears = newNumYear;
        loanAmount = newLoanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumOfYears() {
        return numOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double newIR) {
        annualInterestRate = newIR;
    }

    public void setLoanAmount(double newLoanAmount) {
        loanAmount = newLoanAmount;
    }

    public void setLoanDate(Date newDate) {
        loanDate = newDate;
    }

    public void setNumOfYears(int newNumYear) {
        numOfYears = newNumYear;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate/100/12;
        double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-(1/Math.pow((1+monthlyInterestRate), (numOfYears*12))));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment()*numOfYears*12;
        return totalPayment;
    }


}
