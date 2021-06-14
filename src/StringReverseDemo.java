public class StringReverseDemo {
    public static void main(String[] args) {


        // String reverse using recursive function
        System.out.println(reverse("Hello"));

        System.out.println(reverse1("Hello"));
    }

    public static String reverse(String str) {
        if(str.isEmpty()) return str;
        return reverse(str.substring(1))+str.charAt(0);
    }

    public static String reverse1(String str) {
        if(str.isEmpty()) return str;
        return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
    }
}

