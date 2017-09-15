package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jlin7 on 9/14/17.
 */

public class SecondMood extends Mood{

    public SecondMood() {
    }

    public SecondMood(Date date) {
        super(date);
    }

    @Override
    public String currentMood() {
        return "Sad";
    }
}
