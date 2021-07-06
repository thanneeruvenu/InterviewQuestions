package corejava.lambda;

public class Demo3 {
    public static void main(String[] args) {
        Interface3 interface3 = s -> s.length();
        System.out.println("Interface3 Object : "+interface3.getClass().getSimpleName());
        System.out.println("Interface3 Object : "+(interface3 instanceof Interface4));
        System.out.println("Interface3 Object : "+(interface3 instanceof Interface3));

        System.out.println("Length : "+ interface3.getLength("Hello"));

        Interface4 interface4 = str -> str.length();
        System.out.println("Interface4 Object : "+interface4.getClass().getSimpleName());
        System.out.println("Interface4 Object : "+(interface4 instanceof Interface4));
        System.out.println("Interface4 Object : "+(interface4 instanceof Interface3));
        System.out.println("Length : "+ interface4.getLength("Hello"));

        Interface5 interface5 = str -> String.valueOf(str.length());
        System.out.println("Length : "+ interface5.getLength("Hello"));

    }
}

interface Interface3 {
     Object getLength(String str);
}

interface Interface4 extends Interface3 {
     Integer getLength(String str);
}

interface Interface5 extends Interface3 {
    String getLength(String str);
}