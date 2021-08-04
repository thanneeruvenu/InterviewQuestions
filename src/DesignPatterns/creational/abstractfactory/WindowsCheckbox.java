package DesignPatterns.creational.abstractfactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Windows Check box Impl ...");
    }
}
