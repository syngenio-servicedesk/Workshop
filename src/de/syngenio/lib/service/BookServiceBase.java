
package de.syngenio.lib.service;

import java.util.Collection;

import de.syngenio.lib.dao.BookDao;
import de.syngenio.lib.domainobject.Book;
import de.syngenio.lib.io.CharacterReader;

public abstract class BookServiceBase implements IMenuChoiceService{

	private BookDao bookDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
}
