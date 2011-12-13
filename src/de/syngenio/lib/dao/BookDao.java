package de.syngenio.lib.dao;

import java.util.Collection;

import de.syngenio.lib.domainobject.Book;

public class BookDao {

	public Book findBookById(long bookId) {
		return BookRegistry.getBookById(bookId);
	}

	public Collection<Book> findAllBooks() {
		return BookRegistry.getAllBooks();
	}

	public void saveBook(Book bookToSave) {
		BookRegistry.registerBook(bookToSave);
	}
}
