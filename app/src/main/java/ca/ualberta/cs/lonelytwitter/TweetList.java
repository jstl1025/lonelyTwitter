package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by jlin7 on 10/12/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets=new ArrayList<Tweet>();

    public TweetList(){
    }

    public void add(Tweet tweet){
        if(hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        else{
            tweets.add(tweet);
        }

    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public ArrayList<Tweet> getTweet(){
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });

        return tweets;
    }
}
