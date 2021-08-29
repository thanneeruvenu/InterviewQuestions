package DesignPatterns.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Application application = configureApplication("windows");
        application.paint();
    }

    static Application configureApplication(String osName) {
        Application app = null;
        switch (osName) {
            case "mac":
                app = new Application(new MacOsGUIFactory());
                break;
            case "windows":
                app = new Application(new WindowsGUIFactory());
        }
        return app;
    }
}
