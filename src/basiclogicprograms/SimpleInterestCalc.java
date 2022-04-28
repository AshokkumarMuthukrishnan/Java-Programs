package basiclogicprograms;

public class SimpleInterestCalc {
    public static void main(String[] args) {
        double principalAmount = 100000, rateOfInterest = 14, time = 36;
        double simpleInterest = (principalAmount * rateOfInterest * time)/100;
        double compoundInterest = principalAmount * (Math.pow((1 + rateOfInterest / 100), time));
        System.out.println("Simple interest = " + simpleInterest);
        System.out.println("Compound interest = " + compoundInterest);
    }
}
