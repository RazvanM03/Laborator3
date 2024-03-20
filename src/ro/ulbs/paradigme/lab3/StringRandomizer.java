package ro.ulbs.paradigme.lab3;

import java.util.Currency;

public class StringRandomizer {
    java.util.Random rand = new java.util.Random();

    public String randomString(int n) {
        int countLetters = 'z' - 'a';
        char result[] = new char[n];

        for(int i=0; i<n; i++) {
            result[i] = (char)('a' + rand.nextInt(countLetters));
        }
        return new String(result);
    }
    public String randomString(int n, String alphabet) {
        int countLetters = alphabet.length();
        char result[] = new char[n];
        for(int i=0; i<n; i++) {
            result[i] = alphabet.charAt(rand.nextInt(countLetters));
        }

        return new String(result);
    }
}
