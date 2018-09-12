package com.snehkoul.quotes;

import android.annotation.TargetApi;

import java.util.concurrent.ThreadLocalRandom;

@TargetApi(11)
public class QuoteServer {

    String[] getQuotes() {
        String[] quotes = new String[]{
                "Hi", "Hello", "Bye"
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


