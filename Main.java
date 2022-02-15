package OOPG.Week3;
import java.util.Scanner;

public class Main {
    
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double newIR = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int newNumOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double newLoanAmount = input.nextDouble();

        loan loan1 = new loan(newIR,newNumOfYears,newLoanAmount);

        System.out.println("The loan was created on " + loan1.loanDate);
        System.out.printf("The monthly payment is %.2f\n", loan1.getMonthlyPayment());
        System.out.printf("The total payment is %.2f\n", loan1.getTotalPayment());


    }
    
}
