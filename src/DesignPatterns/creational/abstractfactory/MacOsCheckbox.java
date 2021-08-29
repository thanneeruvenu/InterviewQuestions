package DesignPatterns.creational.abstractfactory;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac Os check box Impl ...");
    }
}
