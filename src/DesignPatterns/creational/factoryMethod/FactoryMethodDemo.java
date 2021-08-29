package DesignPatterns.creational.factoryMethod;

public class FactoryMethodDemo {
   static Dialog dialog = null;
    public static void main(String[] args) {
      // String type = System.getProperty("os.name");
       config("html");
        runBusinessLogic();
    }

    static void config(String type){
     if(type.equalsIgnoreCase("Windows 10")){
       dialog = new WindowDialog();
     }else {
         dialog = new HtmlDialog();
     }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
