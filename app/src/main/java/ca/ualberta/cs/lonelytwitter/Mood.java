package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jlin7 on 9/14/17.
 */

public abstract class Mood {
    private Date date;
    //private String mood;

    public Mood(){
        date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public abstract String currentMood();



}
