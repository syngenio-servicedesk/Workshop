package de.syngenio.lib.service;

import de.syngenio.lib.dao.BookDao;
import de.syngenio.lib.io.CharacterReader;

public class BookDeletionService implements IMenuChoiceService{

	private BookDao bookDao;

	@Override
	public void optionSelected() {
		System.out.println("Welches Buch soll gelöscht werden:");
		Integer bookId = CharacterReader.readIntegerFromConsole();
		bookDao.deleteBook(bookId);
	}

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}


}
