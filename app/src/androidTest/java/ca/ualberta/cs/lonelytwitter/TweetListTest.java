package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import junit.framework.Assert;

import java.util.ArrayList;

/**
 * Created by jlin7 on 10/12/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        //assertTrue(Boolean.TRUE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));


        try {
            tweets.add(tweet);
            //Assert.fail();
            fail();
        } catch (IllegalArgumentException e){
            Log.e("error","duplicate");
        }

    }

    public void testDelete(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList list =new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList list =new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        //Tweet returnedTweet = list.getTweet(0);
        //assertEquals(returnedTweet.getMessage(),tweet.getMessage());
        ArrayList<Tweet> orderedList=list.getTweet();

        for (int i=0; i < orderedList.size() ;i++){
            if ((orderedList.get(i).getDate().compareTo(orderedList.get(i + 1).getDate()))>0){
                fail();
            }
        }
    }

    public void testGetCount(){
        TweetList list = new TweetList();
        if (list.getCount()!=0){
            fail();
        }
        Tweet tweet = new NormalTweet("count1");
        Tweet tweet1 = new NormalTweet("count2");
        list.add(tweet);
        list.add(tweet1);
        if (list.getCount()!=2){
            fail();
        }
    }
}
