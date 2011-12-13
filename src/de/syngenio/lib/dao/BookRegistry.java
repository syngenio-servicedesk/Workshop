package de.syngenio.lib.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import de.syngenio.lib.domainobject.Book;

public class BookRegistry {

	private static Map<Long, Book> availableBooks = new HashMap<Long, Book>();

	private static long bookIndex=-1;
	
	public static Book getBookById(long bookId) {
		return availableBooks.get(bookId);
	}
	
	public static Collection<Book> getAllBooks(){
		return availableBooks.values();
	}

	public static void registerBook(Book bookToSave) {
		bookToSave.setId(++bookIndex);
		availableBooks.put(bookIndex, bookToSave);
	}

}
