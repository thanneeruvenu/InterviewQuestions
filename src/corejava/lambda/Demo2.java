package corejava.lambda;

public class Demo2 {
    public static void main(String[] args) {

        IntegerAdditionInterface additionInterface = (a, b) -> {
            System.out.println("Input values { " + a + " , " + b + " }");
            return a + b;
        };

        System.out.println("Sum is :" + additionInterface.add(10, 20));

        NumberInterface numberInterface = (a, b) -> {
            System.out.println("Input values { " + a + " , " + b + " }");
            return a + b;
        };

        System.out.println("Sum is :" + numberInterface.add(10, 20));
    }
}

/**
 * Functional Interface
 */
interface NumberInterface {
    public int add(int a, int b);
}

interface IntegerAdditionInterface extends NumberInterface {
    public int add(int a, int b);

}
