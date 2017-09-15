package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jlin7 on 9/13/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    protected Mood mood;
    ArrayList<Mood> moodList = new ArrayList<Mood>();

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    public void getMood(Mood mood){
        this.mood = new FirstMood();
        moodList.add(this.mood);
        this.mood = new SecondMood();
        moodList.add(this.mood);

    }


    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean isImportant();



}
