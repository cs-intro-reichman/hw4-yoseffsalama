public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); 
        System.out.println(contains("happy", "unhappy")); 
        System.out.println(contains("historical", "story")); 
        System.out.println(contains("psychology", "psycho")); 
        System.out.println(contains("personality", "son")); 
        System.out.println(contains("personality", "dad")); 
        System.out.println(contains("resignation", "sign")); 
    }


    public static String lowerCase(String str) { 
        String result = "";
        for (int i=0; i<str.length(); i++) {
        char c= str.charAt(i);
        if (c>='A' && c<='Z') {
          c+=('a'-'A');
        }
        result+=c;   
      }
      return  result;
    }

    public static boolean contains(String str1, String str2) {
        int m=0;
        if (str1.length()<str2.length()) {
            return false;
        }
        for (int i=0; i<str1.length(); i++) {
            m=0;
            for (int j=0; j<str2.length(); j++) {
                if (str1.charAt(i)!=str2.charAt(j)) {
                    break;
                }
                else {
             i++; 
             m++;
                }
            }
            if (m==str2.length()) {
                return true;
            } 
        }
       
        return false;
        
    }
}
