package coremathlibraryy;

public class TrigonometryOps extends MathematicalOperation {
    public double getSine() { return Math.sin(Math.toRadians(getOperand1())); }
    public double getCosine() { return Math.cos(Math.toRadians(getOperand1())); }
}