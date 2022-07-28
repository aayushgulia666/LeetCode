package LeetCode;

import java.util.Arrays;

/**
 * #author: Aayush gulia
 * #email: aayushgulia07@outlook.com
 * #Dated: 29-07-2022 00:33:45
 *
 * There are many approaches to solve valid anagram approach but i found this easy to use.
 */

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "rat";
        String s2 = "car";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();


        System.out.println(isAnagram(ch1, ch2));

    }

    static boolean isAnagram(char[] ch1, char[] ch2){
        if (ch1.length != ch2.length){
            return false;
        }

        // sort both strings

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // compare each elements

        for (int i=0; i< ch1.length; i++){
            if (ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
}
