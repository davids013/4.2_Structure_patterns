package Calculator_1;

public class IntsCalculatorAdapter implements Ints {
    private final Calculator CALC;

    public IntsCalculatorAdapter(Calculator calc) {CALC = calc;}
    @Override
    public int sum(int arg0, int arg1) {
        return (int) Math.round(
                CALC
                        .newFormula()
                        .addOperand(arg0)
                        .addOperand(arg1)
                        .calculate(Calculator.Operation.SUM)
                        .result()
        );
    }

    @Override
    public int sub(int arg0, int arg1) {
        return (int) Math.round(
                CALC
                        .newFormula()
                        .addOperand(arg0)
                        .addOperand(arg1)
                        .calculate(Calculator.Operation.SUB)
                        .result()
        );
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) Math.round(
                CALC
                        .newFormula()
                        .addOperand(arg0)
                        .addOperand(arg1)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
    }

    @Override
    public int div(int arg0, int arg1) {
        return (int) Math.round(
                CALC
                        .newFormula()
                        .addOperand(arg0)
                        .addOperand(arg1)
                        .calculate(Calculator.Operation.DIV)
                        .result()
        );
    }

    @Override
    public int pow(int a, int b) {
        return (int) Math.round(
                CALC
                        .newFormula()
                        .addOperand(a)
                        .addOperand(b)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );
    }
}
