package coremathlibraryy;

public class ArithmeticOps extends MathematicalOperation {
    public double add() { return getOperand1() + getOperand2(); }
    public double subtract() { return getOperand1() - getOperand2(); }
    public double multiply() { return getOperand1() * getOperand2(); }
    
    public double divide() {
        if (getOperand2() == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return getOperand1() / getOperand2();
    }
}