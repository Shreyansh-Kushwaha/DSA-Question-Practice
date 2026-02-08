import java.util.*;

public class Valid_Anagram {
    public static void main(String[] args) {

        String stomp = "anagram";
        String stemp = "nagaram";

        if (stomp.length() != stemp.length()) {
            System.out.println("false");
            return;
        }

        HashMap<Character, Integer> mop = new HashMap<>();

        // Count characters from first string
        for (int i = 0; i < stomp.length(); i++) {
            char c = stomp.charAt(i);
            mop.put(c, mop.getOrDefault(c, 0) + 1);
        }

        // Subtract using second string
        for (int i = 0; i < stemp.length(); i++) {
            char c = stemp.charAt(i);

            if (!mop.containsKey(c)) {
                System.out.println("false");
                return;
            }

            mop.put(c, mop.get(c) - 1);
        }

        // Check all counts are zero
        for (int count : mop.values()) {
            if (count != 0) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
