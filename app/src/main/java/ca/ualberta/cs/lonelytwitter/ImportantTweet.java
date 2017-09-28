/*
 * ImportantTweet
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
public class ImportantTweet extends Tweet {
    /**
     * construct an ImportantTweet object that explicitly calls its superclass
     *
     * @param message ImportantTweet message
     */
    public ImportantTweet (String message){
        super(message);
    }

    /**
     * construct an ImportantTweet object that explicitly calls its superclass
     *
     * @param message ImportantTweet message
     * @param date ImportantTweet date
     */
    public ImportantTweet (String message, Date date){
        super (message, date);
    }

    /**
     * It is importantTweet, so return true
     *
     * @return True
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}