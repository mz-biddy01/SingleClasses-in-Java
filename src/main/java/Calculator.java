public class Calculator {

    private int add;
    private int subtract;
    private int multiply;
    private double divide;



    public Calculator(int add, int subtract, int multiply, double divide){
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public int  canAdd() {
        return add;
    }

    public int canSubtract() {
        return subtract;
    }

    public int canMultiply() {
        return multiply;
    }

    public double canDivide() {
        return  divide;
    }



}
