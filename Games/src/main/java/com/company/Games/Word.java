package com.company.Games;

public class Word {
    //CREATE VARIABLES
    private String word;
    private String definition;

    //EMPTY CONSTRUCTOR
    public Word(){}

    //CONSTRUCTOR
    public Word(String word, String definition){
        this.word = word;
        this.definition = definition;
    }

    //GETTERS AND SETTERS
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
