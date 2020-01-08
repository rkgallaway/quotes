package quotes;

import java.util.ArrayList;

public class QuoteLibrary {
    private ArrayList<Quote> quotes;
    // Library needs to take in an arraylist of quotes
    // needs to select a random quote
    // needs to not select repeats
    QuoteLibrary(){
        this.quotes = new ArrayList<Quote>();
    }

    QuoteLibrary(ArrayList<Quote> quotes){
        this.quotes = quotes;
    }
    
    public int addQuote(String author, String text, String[] tags){
        this.quotes.add(new Quote(author, text, tags));
        return this.quotes.size();
    }

    public Quote getRandomQuote(){
        int index = (int) (Math.random() * this.quotes.size());
        return this.quotes.get(index);
    }

    public Quote getRandomQuote(String tag){
        ArrayList<Quote> filtered = new ArrayList<Quote>();
        for(Quote quote : this.quotes){
            for(String quoteTag : quote.tags){
                if(tag.equals(quoteTag)) filtered.add(quote);
            }
        }
        int index = (int) (Math.random() * filtered.size());
        return filtered.get(index);
    }

}
