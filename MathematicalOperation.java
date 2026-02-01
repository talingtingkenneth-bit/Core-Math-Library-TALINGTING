package coremathlibraryy;

// Base Class
public class MathematicalOperation {
    private double operand1;
    private double operand2;

    public void setOperand1(double value) {
        this.operand1 = value;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand2(double value) {
        this.operand2 = value;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setInputs(double a, double b) {
        setOperand1(a);
        setOperand2(b);
    }
}