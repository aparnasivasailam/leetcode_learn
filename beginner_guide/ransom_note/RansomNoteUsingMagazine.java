package beginner_guide.ransom_note;

import java.util.Scanner;;
public class RansomNoteUsingMagazine {
    public static void main(String[] args) {
        System.out.println("Enter ransom string: ");
        String ransom = fetchString().toLowerCase();
        System.out.println("Enter magazine string: ");
        String magazine = fetchString().toLowerCase();
        System.out.println(canRansomNoteBeMade(ransom, magazine));
    }

    public static String fetchString() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public static boolean canRansomNoteBeMade(String ransom, String magazine) {
        char[] dictionary = new char[26];
        for(int i = 0; i < magazine.length(); i++) {
            dictionary[magazine.charAt(i)-'a']++;
        }

        for(int i = 0; i < ransom.length(); i++) {
            int index = ransom.charAt(i)-'a';
            if(dictionary[index] == 0) {
                return false;
            }
            dictionary[index]--;
        }
        return true;
    }
}
