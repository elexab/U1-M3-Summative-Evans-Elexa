package com.company.Games;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class WordController {
    //CREATE VARIABLES
    Map<String, String> word = new HashMap<>();

    //CREATE AN INSTANCE OF THE RANDOM CLASS
    Random rand = new Random();

    //CONSTRUCTOR
    public WordController() {
        //ADD 10 ENTRIES OF WORDS AND THEIR DEFINITIONS
        //FORMAT WORD::DEFINITION
        this.word.put("PATIENCE", "the quality of being patient, as the bearing of provocation, " +
                "annoyance, misfortune, or pain, without complaint, loss of temper, irritation, " +
                "or the like");//1
        this.word.put("PERSEVERANCE", "steady persistence in a course of action, a purpose, a state, etc., especially " +
                "in spite of difficulties, obstacles, or discouragement");//2
        this.word.put("CONFIDENCE", "belief in oneself and one's powers or abilities; self-confidence; self-reliance; assurance");//3
        this.word.put("AMBITION", "an earnest desire for some type of achievement or distinction, as power, honor, fame, or " +
                "wealth, and the willingness to strive for its attainment");//4
        this.word.put("LOYALTY", "the state or quality of being loyal; faithfulness to commitments or obligations");//5
        this.word.put("COMMITMENT", "the act of committing, pledging, or engaging oneself");//6
        this.word.put("COURAGE", "the quality of mind or spirit that enables a person to face difficulty, danger, " +
                "pain, etc., without fear; bravery");//7
        this.word.put("FORGIVENESS", "act of forgiving; state of being forgiven");//8
        this.word.put("RESILIENCE", "ability to recover readily from illness, depression, adversity, or the like; buoyancy");//9
        this.word.put("BUOYANCY", "lightness or resilience of spirit; cheerfulness");//10
    }

    //GET ROUTE
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public String getWordDef() {
        //GETS RANDOM KEY WITH MATCHING VALUE
        Object randomWordDef = this.word.keySet().toArray()[new Random().nextInt(this.word.keySet().toArray().length)];
        return randomWordDef.toString() + "-" + this.word.get(randomWordDef);
    }
}
