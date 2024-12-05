public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (((int) (str.charAt(i)) <= 90) && ((int) (str.charAt(i)) >= 65 )) {
                str = str.substring(0, i) + ((char) ((int) (str.charAt(i)) + 32)) + str.substring(i+1);
            } 
        }
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        for (int i = 0; i <= str1.length()-str2.length(); i++) {
            int goodi = i;
            for (int k = 0; k < str2.length(); k++) {
                if (str2.charAt(k) != str1.charAt(goodi)) {
                    break;
                }
                goodi++;
                if (k == str2.length()-1) {
                    return true;
                }
            }
        }
        return str2.length() == 0;
    }
}
