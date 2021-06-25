package corejava;

public class FindFirstNonRepeatCharacterInStringDemo {

    public static void main(String[] args) {
        String s = "abcdefghab";
       // s = "ahgfedcab";
        s = "ababac";
        System.out.println(" ### approach1 ### : " + approach1(s));
        System.out.println(" ### approach2 ### : " + approach2(s));

    }

    /**
     * Using sub String to find non repeated char
     *
     * @param input
     * @return
     */
    private static Character approach1(String input) {
        Character output = null;
        for (int i = 0; i < input.length(); i++) {
            if (!input.substring(i + 1).contains(String.valueOf(input.charAt(i))) &&
                    !input.substring(0,i).contains(String.valueOf(input.charAt(i)))) {
                output = input.charAt(i);
                break;
            }
        }
        return output;
    }

    /**
     * Using Last index of to find non repeated char
     * @param input
     * @return
     */
    private static Character approach2(String input) {
        Character output = null;
        for (int i=0; i<input.length();i++){
         if(input.lastIndexOf(input.charAt(i)) == input.indexOf(input.charAt(i))){
             output = input.charAt(i);
             break;
         }
        }
        return output;
    }


}
