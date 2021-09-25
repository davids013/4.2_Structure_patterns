package Calculator_1;

public class MainCalculator {
    public static void main(String[] args) {
        System.out.println("\tЗадача 1. Калькулятор (шаблон Adapter)");
        Ints intsCalc = new IntsCalculatorAdapter(new Calculator());
        System.out.println("sum(2, 2) = " + intsCalc.sum(2, 2));
        System.out.println("sub(10, 22) = " + intsCalc.sub(10, 22));
        System.out.println("mult(3, 41) = " + intsCalc.mult(3, 41));
        System.out.println("div(74, 10) = " + intsCalc.div(74, 10));
        System.out.println("pow(2, 8) = " + intsCalc.pow(2, 8));
    }
}
