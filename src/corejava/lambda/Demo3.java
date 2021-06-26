package corejava.lambda;

public class Demo3 {
    public static void main(String[] args) {
        Interface3 interface3 = s -> s.length();
        System.out.println("Interface3 Object : "+interface3.toString());
        System.out.println("Length : "+ interface3.getLength("Hello"));

        Interface4 interface4 = str -> str.length();
        System.out.println("Length : "+ interface4.getLength("Hello"));
    }
}

interface Interface3 {
     Object getLength(String str);
}

interface Interface4 extends Interface3 {
     Integer getLength(String str);
}