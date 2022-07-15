import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Author author = new Author();
        Author author2 = new Author();
        Author author3 = new Author();

        Album album = new Album();
        Album album2 = new Album();
        Album album3 = new Album();

        Quotes quotes = new Quotes();
        Quotes quotes2 = new Quotes();
        Quotes quotes3 = new Quotes();

        ArrayList<Quotes> quoteList = new ArrayList<>();
        quoteList.add(quotes);
    }
}
