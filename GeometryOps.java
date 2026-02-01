package coremathlibraryy;

public class GeometryOps extends MathematicalOperation {
    public double circleArea() {
        if (getOperand1() < 0) return -1;
        return Math.PI * getOperand1() * getOperand1();
    }

    public double circleCircumference() {
        if (getOperand1() < 0) return -1;
        return 2 * Math.PI * getOperand1();
    }

    public double rectangleArea() {
        return getOperand1() * getOperand2();
    }

    public double rectanglePerimeter() {
        return 2 * (getOperand1() + getOperand2());
    }
}