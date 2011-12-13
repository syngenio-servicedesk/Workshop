
package de.syngenio.lib.service;

import de.syngenio.lib.dao.BookDao;

public abstract class BookServiceBase implements IMenuChoiceService{

	protected BookDao bookDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
}
