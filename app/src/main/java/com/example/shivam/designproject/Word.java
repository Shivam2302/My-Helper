package com.example.shivam.designproject;

/**
 * Created by shivam on 23/12/17.
 */

public class Word {

    private String heading;
    private String content;

    Word(String h, String c){
        heading = h;
        content = c;
    }

    public String getHeading() { return heading; }

    public String getContent(){
        return content;
    }
}
