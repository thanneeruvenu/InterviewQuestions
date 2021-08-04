package DesignPatterns.creational.abstractfactory;

public class WindowsButton implements  Button{

    @Override
    public void paint() {
        System.out.println("Window Button Impl ... ");
    }
}
