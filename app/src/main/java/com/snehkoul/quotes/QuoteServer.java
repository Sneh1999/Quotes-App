package com.snehkoul.quotes;

import android.annotation.TargetApi;

import java.util.concurrent.ThreadLocalRandom;

@TargetApi(11)
public class QuoteServer {

    String[] getQuotes() {
        String[] quotes = new String[]{
                "Create the highest, grandest vision possible for your life, because you become what you believe","When you can’t find the sunshine, be the sunshine","The grass is greener where you water it","Wherever life plants you, bloom with grace"
        };

       return quotes;
    }
    String getRandomQuote(){
        String quote;
        int quotesArrayLen = getQuotes().length;
        int randomNum = ThreadLocalRandom.current().nextInt(quotesArrayLen);
        quote = getQuotes()[randomNum];
        return quote;

    }

}


