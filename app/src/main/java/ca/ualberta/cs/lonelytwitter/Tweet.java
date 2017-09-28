/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 *  You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author team X
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    protected Mood mood;
    ArrayList<Mood> moodList = new ArrayList<Mood>();

    /**
     * Construct a Tweet object
     *
     * @param message Tweet message
     */
    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    /**
     * Get the moods and add moods to moodList
     *
     * @param mood
     */
    public void getMood(Mood mood){
        this.mood = new FirstMood();
        moodList.add(this.mood);
        this.mood = new SecondMood();
        moodList.add(this.mood);

    }

    /**
     *get tweet message
     *
     * @return tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Set the tweet date
     *
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     *put date and message in the format: date|message
     *
     * @return string
     */
    @Override
    public String toString(){
        return date.toString() + "|" + message;
    }

    /**
     * get tweet date
     *
     * @return tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * return true if tweet isImportant, otherwise false
     *
     * @return true/false
     */
    public abstract Boolean isImportant();



}
