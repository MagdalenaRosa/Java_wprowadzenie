import java.util.Arrays;

public class StringUtils {
    Boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " i " + str2 + " jest anagramem.");
                return Boolean.TRUE;
            } else {
                System.out.println(str1 + " i " + str2 + " nie jest anagramem.");
                return Boolean.FALSE;
            }
        } else {
            System.out.println(str1 + " i " + str2 + " nie jest anagramem.");
            return Boolean.FALSE;
        }


    }

    public static void main(String[] args) {
        StringUtils s1= new StringUtils();
        s1.isAnagram("Care","race");
        s1.isAnagram("kot","plot");
        s1.isAnagram("pies","siep");



    }
}


