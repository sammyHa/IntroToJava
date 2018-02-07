import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args) {
        double investmentAmount, monthlyInterestRate;
        int numberOfYears;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter investment amount: ");
        investmentAmount = scanner.nextDouble();

        System.out.print(" Enter annual interest rate in percentage: ");
        monthlyInterestRate = (scanner.nextDouble()/100)/12;
        System.out.print(" Enter number of years: ");
        numberOfYears = scanner.nextInt();
       double futureInvestmentValue = investmentAmount * Math.pow(1+ monthlyInterestRate,numberOfYears*12);

        System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
