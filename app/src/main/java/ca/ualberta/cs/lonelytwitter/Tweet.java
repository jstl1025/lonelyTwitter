package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jlin7 on 9/13/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    public Mood mood;


    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

//    public Tweet(Mood mood){
//        this.mood = mood;
//    }
//
//    public abstract Mood currentMood();

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
