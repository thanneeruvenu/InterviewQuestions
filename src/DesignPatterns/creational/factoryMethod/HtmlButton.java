package DesignPatterns.creational.factoryMethod;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Html Button render Impl! ");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Html Button says - 'Hello World!'");
    }
}
