import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Epigram {

    public static void main(String[] args) {
        String sentence = "DealingwithfailureiseasyWorkhardtoimproveSuccessisalsoeasytohandleYouvesolvedthewrongproblemWorkhardtoimprove";
        final int sum = sumByASCIICodes(sentence);
        System.out.println(sum);

    }

    static final List<Character> consonants = new ArrayList<Character>(Arrays
            .asList('B', 'b','C','c', 'D','d', 'F','f', 'G','g', 'H','h', 'J','j', 'K','k', 'L','l', 'M','m', 'N','n', 'P','p', 'Q','q', 'R','r', 'S','s', 'T','t','V', 'v','W', 'w','X', 'x','Y' ,'y','Z', 'z'));
    static final List<Character> vowels = new ArrayList<Character>(Arrays.asList('a','A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));

    private static boolean isConsonant(char c) {
        return consonants.contains(c);
    }

    private static boolean isVowel (char c) {
        return vowels.contains(c);
    }

    private static int getASCIICode(char c) {
        if (isConsonant(c))
            return c;
        if (isVowel(c))
            return -c;
        return 0;
    }

    public static int sumByASCIICodes(String sentence) {
        int sum = 0;
        for(int i=0; i<sentence.length(); i++) {
            sum += getASCIICode(sentence.charAt(i));
        }
        return sum;
    }
}
