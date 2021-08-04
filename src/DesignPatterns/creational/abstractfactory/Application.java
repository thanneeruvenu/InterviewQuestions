package DesignPatterns.creational.abstractfactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }

}
