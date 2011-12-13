package de.syngenio.lib.service;

import java.util.Collection;

import de.syngenio.lib.dao.BookDao;
import de.syngenio.lib.domainobject.Book;
import de.syngenio.lib.io.CharacterReader;

public class BookShowService implements IMenuChoiceService{


	private BookDao bookDao;
	
	@Override
	public void optionSelected() {
		Collection<Book> booksFound = bookDao.findAllBooks();
		System.out.println("Folgende Bücher sind registriert:");
		for (Book book : booksFound) {
			System.out.println("" + book);
		}
		CharacterReader.readString("Bitte drücken sie irgendeine Taste für weiter");
	}
	
	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}


	
}
