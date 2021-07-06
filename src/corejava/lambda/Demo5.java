package corejava.lambda;

public class Demo5 {
    public static void main(String[] args) {

        // Without Lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Without Lambda Thread Name : "+Thread.currentThread().getName());
            }
        }).start();

        System.out.println("Thread Name : "+Thread.currentThread().getName());

        // With Lambda
        new Thread(
                ()->System.out.println("With Lambda Thread Name : "+Thread.currentThread().getName())
        ).start();
    }

}
