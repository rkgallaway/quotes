/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class App {

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new Gson();
        FileReader myFile = new FileReader("src/main/resources/quotes.json");
        ArrayList<Quote> quotes = gson.fromJson(myFile, new TypeToken<ArrayList<Quote>>(){}.getType());

        QuoteLibrary quoteLibrary = new QuoteLibrary(quotes);
        if(args.length > 0) {
            System.out.println(quoteLibrary.getRandomQuote(args[0]));
        } else {
            System.out.println(quoteLibrary.getRandomQuote());
        }
    }
}
