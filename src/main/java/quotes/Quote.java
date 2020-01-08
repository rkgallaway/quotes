package quotes;

public class Quote {

    public String author;
    public String text;

    public Quote (String author, String text) {

        this.author = author;
        this.text = text;
    }



    @Override
    public String toString() {
        return String.format("%s:  \"%s\"", this.author, this.text);
    }
}
