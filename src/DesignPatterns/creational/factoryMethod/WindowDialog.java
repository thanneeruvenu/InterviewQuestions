package DesignPatterns.creational.factoryMethod;

public class WindowDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
