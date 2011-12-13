package de.syngenio.lib.service;

import java.util.Collection;

import de.syngenio.lib.dao.BookDao;
import de.syngenio.lib.domainobject.Book;
import de.syngenio.lib.io.CharacterReader;

public class BookEditService extends BookServiceBase{

	private final BookDao _bookDao;
	
	private final static long ABORT_OPERATION = 0;
	
	public BookEditService(BookDao bookDao) {
		_bookDao = bookDao;
	}

	@Override
	public void optionSelected() {
		long bookId = chooseBook();
		if (bookId != ABORT_OPERATION) {
			int change  = chooseChange();
			String newValue = CharacterReader.readString("Bitte neuen Wert eingeben");
			switch (change) {
				case 0:
					changeBookTitle(bookId, newValue);
				case 1:
					changeBookIsbn(bookId, newValue);
			}
		}
			
	}
	
	
	private void changeBookIsbn(long bookId, String newValue) {
		_bookDao.findBookById(bookId).setIsbn(newValue);
		
	}

	private void changeBookTitle(long bookId, String newValue) {
		_bookDao.findBookById(bookId).setName(newValue);
	}

	private int chooseChange() {
		System.out.println("Welche Eigenschaft soll geändert weden?");
		System.out.println("(0) Titel ändern");
		System.out.println("(1) ISBN ändern");
		
		return CharacterReader.readIntegerFromConsole();
	}

	private long chooseBook() {
		boolean validBookId = false;
		boolean abort = false;
		long bookId = ABORT_OPERATION;
		while (!validBookId && !abort) {
			System.out.println("Welches Buch soll geändert werden?");
			Collection<Book> books = _bookDao.findAllBooks();
			for (Book book : books) {
				System.out.println(book.toString());
			}
			//TODO change abort key
			bookId = CharacterReader.readIntegerFromConsole("Bitte Buch ID eingeben, oder \"10\" zum Abbruch:");
			
			if (_bookDao.findBookById(bookId) != null) {
				validBookId = true;
			}
		}
		return bookId;
	}

}
