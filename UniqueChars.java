/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String temp = "";
        String newString = "";
        for (int i = 0; i< s.length(); i++) {
            if (temp.contains(Character.toString(s.charAt(i))) && s.charAt(i) != ' ') {
                ;
            }
            else {
                newString += s.charAt(i);
                temp += s.charAt(i);
            }
        }
        return newString;
    }
}