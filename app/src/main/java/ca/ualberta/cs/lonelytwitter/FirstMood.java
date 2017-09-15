package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jlin7 on 9/14/17.
 */

public class FirstMood extends Mood {

    public FirstMood(String mood) {
        super(mood);
    }

    public FirstMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public String getMood() {
        return "Happy";
    }
}
