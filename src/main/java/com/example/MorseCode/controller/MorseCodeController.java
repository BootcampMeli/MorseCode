package com.example.MorseCode.controller;

import com.example.MorseCode.entities.MorseCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MorseCodeController {

    @GetMapping("/word/{word}")
    public String word(@PathVariable String word) {
        return MorseCode.getMorseCodeFromWord(word);
    }

    @GetMapping("/morseCode/{morseCode}")
    public String morseCode(@PathVariable String morseCode) {
        return MorseCode.getWordFromMorseCode(morseCode);
    }

}
