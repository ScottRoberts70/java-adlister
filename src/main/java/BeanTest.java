import beans.Album;
import beans.Artist;
import beans.Author;
import beans.Quotes;

import java.util.ArrayList;
import java.util.Date;

public class BeanTest {

    public static void main(String[] args) {
        Author author = new Author(1,"Scott", "Roberts");
        Author author2 = new Author(2,"Mike", "Friend");
        Author author3 = new Author(3, "Dillon", "Miller");

        Artist artist = new Artist("Mike", false, "English");
        Artist artist2 = new Artist("Jake", true, "English");
        Artist artist3 = new Artist("MacDillon", false, "English");

        Album album = new Album(artist,"Mike", new Date("1/1/2021"), 3.5, "R&B");
        Album album2 = new Album(artist2,"Jake", new Date("1/1/2021"), 1.5, "Rap");
        Album album3 = new Album(artist3,"MacDillon", new Date("1/1/2021"), 4.5, "Rock");

        Quotes quotes = new Quotes("blah blah blah",  author);
        Quotes quotes1 = new Quotes("haha haha haha",  author2);
        Quotes quotes2 = new Quotes("No no none",  author3);

        ArrayList<Quotes> quoteList = new ArrayList<>();
        quoteList.add(quotes);
        quoteList.add(quotes1);
        quoteList.add(quotes2);

        for (Quotes quoteInfo : quoteList){
            System.out.println("Quote: " + (quoteInfo.getContent() + " Author: " + (quoteInfo.getAuthor().getFirstName()) + " " +(quoteInfo.getAuthor().getLastName())));
        }
    }
}
