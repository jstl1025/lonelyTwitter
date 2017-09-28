/*
 * Mood
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

import java.util.Date;

/**
 * Represents a Mood.
 *
 * @author team X
 * @version 1.5
 * @see FirstMood
 * @see SecondMood
 * @since 1.0
 */
public abstract class Mood {
    private Date date;

    /**
     * Construct a Mood object
     */
    public Mood(){
        date = new Date();
    }

    /**
     * Construct a Mood object
     *
     * @param date Mood date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * set the Mood date
     *
     * @param date mood date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * get mood date
     *
     * @return mood date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Get the current mood in string format
     *
     * @return mood in string
     */
    public abstract String currentMood();



}
