package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jlin7 on 9/14/17.
 */

public class SecondMood extends Mood{

    public SecondMood(String mood) {
        super(mood);
    }

    public SecondMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public String currentMood() {
        return "Sad";
    }
}
