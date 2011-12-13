package de.syngenio.lib.service;

import de.syngenio.lib.dao.BookDao;
import de.syngenio.lib.io.CharacterReader;

public class BookDeletionService extends BookServiceBase{

	private BookDao bookDao;

	@Override
	public void optionSelected() {
		System.out.println("Welches Buch soll gelöscht werden:");
		Integer bookId = CharacterReader.readIntegerFromConsole();
		bookDao.deleteBook(bookId);
	}
}
