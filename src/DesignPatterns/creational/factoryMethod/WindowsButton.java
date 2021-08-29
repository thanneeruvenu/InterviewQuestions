package DesignPatterns.creational.factoryMethod;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows Button render Impl! ");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Windows Button says - 'Hello World!'");
    }
}
