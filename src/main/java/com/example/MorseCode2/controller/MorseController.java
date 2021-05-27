package com.example.MorseCode2.controller;

import com.example.MorseCode2.code.Code;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class MorseController {

    @GetMapping()
    public String esse(){
        return "Vá para: localhost:8082/word/{sua palavra}";
    }

    @GetMapping("/word/{word}")
    public String word(@PathVariable String word){
        return Code.getMorseFromWord(word);
    }
/*
    @GetMapping("/morse/{morseCode}")
    public String morse(@PathVariable String morse){
        return Code.getWordFromCode(morse);
    }
*/
}
