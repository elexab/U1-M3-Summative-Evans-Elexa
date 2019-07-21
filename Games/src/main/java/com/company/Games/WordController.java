package com.company.Games;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class WordController {
    //CREATE VARIABLES
    private List<Word> wordList;

    //CREATE AN INSTANCE OF THE RANDOM CLASS
    Random rand = new Random();

    //CONSTRUCTOR
    public WordController() {
        wordList = new ArrayList<>();
        //ADD 10 ENTRIES OF WORDS AND THEIR DEFINITIONS
        //FORMAT WORD::DEFINITION
        wordList.add(new Word("PATIENCE", "the quality of being patient, as the bearing of provocation, " +
                "annoyance, misfortune, or pain, without complaint, loss of temper, irritation, " +
                "or the like"));//1
        wordList.add(new Word ("PERSEVERANCE", "steady persistence in a course of action, a purpose, a state, etc., especially " +
                "in spite of difficulties, obstacles, or discouragement"));//2
        wordList.add(new Word ("CONFIDENCE", "belief in oneself and one's powers or abilities; self-confidence; self-reliance; assurance"));//3
        wordList.add(new Word("AMBITION", "an earnest desire for some type of achievement or distinction, as power, honor, fame, or " +
                "wealth, and the willingness to strive for its attainment"));//4
        wordList.add(new Word("LOYALTY", "the state or quality of being loyal; faithfulness to commitments or obligations"));//5
        wordList.add(new Word ("COMMITMENT", "the act of committing, pledging, or engaging oneself"));//6
        wordList.add(new Word("COURAGE", "the quality of mind or spirit that enables a person to face difficulty, danger, " +
                "pain, etc., without fear; bravery"));//7
        wordList.add(new Word("FORGIVENESS", "act of forgiving; state of being forgiven"));//8
        wordList.add(new Word("RESILIENCE", "ability to recover readily from illness, depression, adversity, or the like; buoyancy"));//9
        wordList.add(new Word("BUOYANCY", "lightness or resilience of spirit; cheerfulness"));//10
    }

    //GET ROUTE
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Word getWordDef() {
        //RETURN RANDOM WORD WITH ITS DEFINITION
         return this.wordList.get(rand.nextInt(wordList.size()));
    }
}
