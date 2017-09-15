package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jlin7 on 9/14/17.
 */

public abstract class Mood {
    private Date date;
    private String mood;

    public Mood(String mood){
        date = new Date();
        this.mood = mood;
    }

    public Mood(String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public String getMood(){
        return mood;
    }


}
