package quotes;

public class Quote {

    public String author;
    public String text;
    public String[] tags;

    public Quote (String author, String text, String[] tags) {

        this.author = author;
        this.text = text;
        this.tags = tags;
    }



    @Override
    public String toString() {
        return String.format("%s:  \"%s\"", this.author, this.text);
    }
}
