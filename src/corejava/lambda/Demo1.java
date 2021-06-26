package corejava.lambda;

public class Demo1 {
    public static void main(String[] args) {
        // without Lambda
        Interface1 interface1 = new Interface1() {
            @Override
            public void display() {
                System.out.println("Normal interface1 call");
            }
        };
        interface1.display();

        Interface2 interface2 = new Interface2() {
            @Override
            public void display() {
                System.out.println("Normal interface2 call");
            }
        };
        interface2.display();

        Interface1 interface11 = new Interface2() {
            @Override
            public void display() {
                System.out.println("Normal interface call");
            }
        };

        interface11.display();


        // By using Lambda
        Interface1 interface12 = () -> System.out.println("Lambda interface 1 call !!");
        interface12.display();

        Interface2 interface13 = () -> System.out.println("Lambda interface 2 call !!");
        interface13.display();

    }
}

interface Interface1 {
    public void display();
}

interface Interface2 extends Interface1 {

}