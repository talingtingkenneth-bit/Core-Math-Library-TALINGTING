package coremathlibraryy;

public class NumberAnalysis extends MathematicalOperation {
    public boolean isPrime() {
        int n = (int) getOperand1();
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public long factorial() {
        int n = (int) getOperand1();
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public String checkEvenOdd() {
        return (getOperand1() % 2 == 0) ? "Even" : "Odd";
    }
}