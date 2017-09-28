/*
 * NormalTweet
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
 * subclass of Tweet
 *
 * @author team X
 * @version 1.5
 * @see Tweet
 * @since 1.0
 */
public class NormalTweet extends Tweet{

    /**
     * Construct a NormalTweet object
     *
     * @param message NormalTweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Construct a NormalTweet object
     *
     * @param message NormalTweet message
     * @param date NormalTweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * It is not isImportant, so return false
     *
     * @return False
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
