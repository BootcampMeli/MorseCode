package com.example.MorseCode2.code;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Code {

    private static final Map<String, String> morseMap;

    // generate dictionary
    static {
        Map<String, String> thisMap = new HashMap<>();
        //thisMap.put("S.O.S.","...---...");
        //thisMap.put("SOS","...---...");
        thisMap.put("a",".-");
        thisMap.put("b","-...");
        thisMap.put("c","-.-.");
        thisMap.put("d","-..");
        thisMap.put("e",".");
        thisMap.put("f","..-.");
        thisMap.put("g","--.-");
        thisMap.put("h","....");
        thisMap.put("i","..");
        thisMap.put("j",".---");
        thisMap.put("k","-.-");
        thisMap.put("l",".-..");
        thisMap.put("m","--");
        thisMap.put("n","-.");
        thisMap.put("o","---");
        thisMap.put("p",".--.");
        thisMap.put("q","--.-");
        thisMap.put("r",".-.");
        thisMap.put("s","...");
        thisMap.put("t","-");
        thisMap.put("u","..-");
        thisMap.put("v","...-");
        thisMap.put("w",".--");
        thisMap.put("x","-..-");
        thisMap.put("y","-.--");
        thisMap.put("z","--..");
        thisMap.put("0","|");
        thisMap.put("1",".-.");
        thisMap.put("2","...");
        thisMap.put("3","-");
        thisMap.put("4","..-");
        thisMap.put("5","...-");
        thisMap.put("6",".--");
        thisMap.put("7","-..-");
        thisMap.put("8","-.--");
        thisMap.put("9","--..");

        morseMap = thisMap;
    }

    public static String getMorseFromWord(String word) {
        word = word.toLowerCase();
        String morseCodeString = "";
        for (int i = 0; i < word.length(); i++){
            morseCodeString = morseCodeString + getMorseCode(String.valueOf(word.charAt(i))) + " ";
        }
        return morseCodeString;
    }

    private static String getMorseCode(String strin) {
        return morseMap.get(strin);
    }

    //public static String getWordFromCode(String morse) {}
}
