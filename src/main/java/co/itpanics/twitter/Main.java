package co.itpanics.twitter;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String topic = "NBAAllStar";
        ArrayList<String> tweets = TweetManager.getTweets(topic);
        SentimentProcessor.init();

        for(String tweet : tweets) {
            System.out.println(tweet + " : " + SentimentProcessor.findSentiment(tweet));
        }
    }
}
