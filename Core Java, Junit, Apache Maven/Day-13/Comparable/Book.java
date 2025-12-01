package com.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
    
	private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

	

    /**
     * If the result is a positive number, it means the current book (this)
     *  was published after otherBook.
If the result is a negative number, it means the current book (this)
 was published before otherBook.
If the result is 0, it means both books were published in the same year.
     */
    @Override
    public int compareTo(Book otherBook) {
        return this.year - otherBook.year;  // comparing based on publication year
    }

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }

    public static void main(String[] args) {
    	Book book1 = new Book("The Catcher in the Rye", 1951);
    	Book book2 = new Book("To Kill a Mockingbird", 1960);
    	Book book3 = new Book("Python", 2021);
    	Book book4 = new Book("Brave New World", 1932);

    	List<Book> books = new ArrayList<>();
    	books.add(book1);
    	books.add(book2);
    	books.add(book3);
    	books.add(book4);
    	
        Collections.sort(books);  // Sorts based on the natural ordering defined in compareTo

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
