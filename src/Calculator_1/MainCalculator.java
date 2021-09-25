package Calculator_1;

public class MainCalculator {
    public static void main(String[] args) {
        System.out.println("\tЗадача 1. Калькулятор (шаблон Adapter)");
        Ints intsCalc = new IntsCalculatorAdapter(new Calculator());
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sub(10, 22));
        System.out.println(intsCalc.mult(3, 41));
        System.out.println(intsCalc.div(74, 10));
        System.out.println(intsCalc.pow(2, 8));
    }
}
