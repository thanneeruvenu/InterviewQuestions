package corejava.lambda;

public class Demo4 {
    public static void main(String[] args) {
        Interface6 interface6 = a -> a*a;
        System.out.println("Square : " + interface6.square(4));
    }
}

interface Interface6 {
    int square(int a);
}
