public class CreditCardInterestCalculator {
    public static void main(String[] args) {

        double initialBalance = 100;

        double annualInterestRate = 0.17;

        double oneMonthInterest = (initialBalance * annualInterestRate) / 12;

        double twoMonthsInterest = (initialBalance + oneMonthInterest) * annualInterestRate / 12;

        System.out.println("Interest due after one month: $" + oneMonthInterest);

        System.out.println("Interest due after two months: $" + twoMonthsInterest);
    }
}
