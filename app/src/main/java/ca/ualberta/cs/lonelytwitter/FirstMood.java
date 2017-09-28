/*
 * FirstMood
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
 * subclass of Mood
 *
 * @author team X
 * @version 1.5
 * @see Mood
 * @since 1.0
 */
public class FirstMood extends Mood {

    /**
     * Construct a FirstMood object
     *
     */
    public FirstMood() {
    }

    /**
     * Construct a FirstMood object that explicitly calls its superclass
     *
     * @param date FirstMood date
     */
    public FirstMood(Date date) {
        super(date);
    }

    /**
     * return "happy"
     *
     * @return the mood in string
     */
    @Override
    public String currentMood() {
        return "Happy";
    }
}
