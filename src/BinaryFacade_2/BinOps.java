package BinaryFacade_2;

public abstract class BinOps {
    public static String sum(String a, String b) {
        int     intA = 0,
                intB = 0;
        a = a.replaceAll("[^0-1]", "");
        b = b.replaceAll("[^0-1]", "");
        try {
            intA = Integer.parseInt(a, 2);
            intB = Integer.parseInt(b, 2);
        } catch (NumberFormatException e) {
            System.err.println("Заданы некорректные двоичные числа");
        }
        String result = Integer.toBinaryString(intA + intB);
        System.out.format("Результат операции: %s (%d) + %s (%d) = %s (%d)%n",
                a, intA, b, intB, result, intA + intB);
        return result;
    }

    public static String mult(String a, String b) {
        int     intA = 0,
                intB = 0;
        a = a.replaceAll("[^0-1]", "");
        b = b.replaceAll("[^0-1]", "");
        try {
            intA = Integer.parseInt(a, 2);
            intB = Integer.parseInt(b, 2);
        } catch (NumberFormatException e) {
            System.err.println("Заданы некорректные двоичные числа");
        }
        String result = Integer.toBinaryString(intA * intB);
        System.out.format("Результат операции: %s (%d) * %s (%d) = %s (%d)%n",
                a, intA, b, intB, result, intA * intB);
        return result;
    }
}
