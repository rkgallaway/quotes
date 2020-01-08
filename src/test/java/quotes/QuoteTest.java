package quotes;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {


    @Test
    public void testToString() {
        Quote testQuote = new Quote("Ryan", "Java is cool");
        assertEquals("Ryan:  \"Java is cool\"", testQuote.toString());
    }
}