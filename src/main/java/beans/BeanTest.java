package beans;

import beans.Album;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Author author = new Author("Scott", "Roberts");
        Author author2 = new Author("Mike", "Friend");
        Author author3 = new Author("Dillon", "Miller");


        Quotes quotes = new Quotes("blah blah blah",  author);
        Quotes quotes1 = new Quotes("haha haha haha",  author);
        Quotes quotes2 = new Quotes("No no none",  author);


        ArrayList<Quotes> quoteList = new ArrayList<>();
        quoteList.add(quotes);
        quoteList.add(quotes1);
        quoteList.add(quotes2);

        for (Quotes quoteInfo : quoteList){
            System.out.println("Quote: " + (quoteInfo.getContent() + " Author: " + (quoteInfo.getAuthor().getFirstName()) + " " +(quoteInfo.getAuthor().getLastName())));
        }
    }
}
