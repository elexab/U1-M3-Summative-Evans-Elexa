package com.company.Games;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class QuoteController {
    //CREATE VARIABLES
    private List<Quote> quoteList;

    //CREATE AN INSTANCE OF THE RANDOM CLASS
    Random rand = new Random();

    public QuoteController() {
        quoteList = new ArrayList<>();
        //ADD 10 ENTRIES OF QUOTES AND THEIR AUTHORS
        //FORMAT QUOTES::AUTHOR
        this.quoteList.add(new Quote("The ultimate measure of a man is not where he stands in moments of comfort " +
                "and convenience, but where he stands at times of challenge and controversy.", "Martin Luther King, Jr."));//1
        this.quoteList.add(new Quote("Forgiveness doesn't make the other person right; it makes you free.", "Stormie Omartian"));//2
        this.quoteList.add(new Quote("I've learned that people will forget what you said, people will forget what you did, but people " +
                "will never forget how you made them feel.", "Maya Angelou"));//3
        this.quoteList.add(new Quote("Do the best you can until you know better. Then when you know better, do better.",
                "Maya Angelou"));//4
        this.quoteList.add(new Quote("Don’t Let Yesterday Take Up Too Much Of Today.", "Will Rogers"));//5
        this.quoteList.add(new Quote("The Pessimist Sees Difficulty In Every Opportunity. The Optimist " +
                "Sees Opportunity In Every Difficulty.", "Winston Churchill"));//6
        this.quoteList.add(new Quote("It’s Not Whether You Get Knocked Down, It’s Whether You Get Up.", "Vince Lombardi"));//7
        this.quoteList.add(new Quote("We May Encounter Many Defeats But We Must Not Be Defeated.", "Maya Angelou"));//8
        this.quoteList.add(new Quote("Knowing Is Not Enough; We Must Apply. Wishing Is Not Enough; We Must Do.",
                "Johann Wolfgang Von Goethe"));//9
        this.quoteList.add(new Quote("The Man Who Has Confidence In Himself Gains The Confidence Of Others.", "Hasidic Proverb"));//10
    }

    //GET ROUTE
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote getQuote() {
        //GETS RANDOM QUOTE WITH MATCHING AUTHOR
        return this.quoteList.get(rand.nextInt(quoteList.size()));


    }

}