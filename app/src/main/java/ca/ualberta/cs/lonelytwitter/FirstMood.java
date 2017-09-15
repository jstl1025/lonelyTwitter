package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jlin7 on 9/14/17.
 */

public class FirstMood extends Mood {

    public FirstMood() {
    }

    public FirstMood(Date date) {
        super(date);
    }

    @Override
    public String currentMood() {
        return "Happy";
    }
}
