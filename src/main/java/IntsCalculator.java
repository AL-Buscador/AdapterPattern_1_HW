public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        double res = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) res;

    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        double res = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) res;
    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        double res = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int) res;
    }

    @Override
    public int div(int a, int b) {
        //считаем через target
        double res = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result();
        return (int) res;
    }

    @Override
    public int sub(int a, int b) {
        //считаем через target
        double res = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUB)
                .result();
        return (int) res;
    }
}