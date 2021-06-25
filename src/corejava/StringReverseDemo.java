package corejava;

public class StringReverseDemo {
    public static void main(String[] args) {


        // String reverse using recursive function
        System.out.println(reverse("Hello"));

        System.out.println(reverse1("Hello"));

        System.out.println(reverse3("Hello World !!!"));

    }

    public static String reverse(String str) {
        if(str.isEmpty()) return str;
        return reverse(str.substring(1))+str.charAt(0);
    }

    public static String reverse1(String str) {
        if(str.isEmpty()) return str;
        return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
    }

    public static String reverse3(String str) {
        System.out.println(str.length());
        char input[] = str.toCharArray();
        int i = 0;
        int n = str.length()-1;
        while (i<=n/2) {
            System.out.println(" index { " + i+ " : "+ (n-i) + " }");
            char temp = input[i];
            input[i] = input[n-i];
            input[n-i] = temp;
            i++;
        }
        return new String(input);
    }
}

