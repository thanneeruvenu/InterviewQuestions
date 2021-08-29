package DesignPatterns.creational.abstractfactory;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Os Button Impl ...");
    }
}
