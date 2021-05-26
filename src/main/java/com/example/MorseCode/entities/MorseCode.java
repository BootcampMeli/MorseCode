package com.example.MorseCode.entities;

public class MorseCode {

    private static char[] LETTERS = { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0' };

    private static String[] CODES = { ".-",   "-...", "-.-.", "-..",  ".",
            "..-.", "--.",  "....", "..",   ".---",
            "-.-",  ".-..", "--",   "-.",   "---",
            ".--.", "--.-", ".-.",  "...",  "-",
            "..-",  "...-", ".--",  "-..-", "-.--",
            "--..", "|" };


    public static String getMorseCodeFromWord(String s){
        s = s.toLowerCase();
        String morseCodeString = "";
        for(int i = 0; i < s.length(); i++){
            morseCodeString = morseCodeString + getMorseCode(s.charAt(i)) + " ";
        }
        return morseCodeString;
    }

    public static String getWordFromMorseCode(String s){
        String[] words = s.split("   ");
        String constructedWord = "";

        for(String word : words) {
            String [] morseCodes = word.split(" ");
            for(String morseCode : morseCodes) {
                constructedWord = constructedWord + getLetter(morseCode);
            }
            constructedWord = constructedWord + " ";
        }

        return constructedWord;
    }

    public static char getLetter(String morseCode){
        for(int i = 0; i < CODES.length; i++) {
            if(morseCode.equals(CODES[i])){
                return LETTERS[i];
            }
        }
        return ' ';
    }

    private static String getMorseCode(char c){
        for(int i = 0; i < LETTERS.length; i++) {
            if(LETTERS[i] == c){
                return CODES[i];
            }
        }
        return "";
    }
}
