package de.syngenio.lib.service;

import java.util.Collection;

import de.syngenio.lib.dao.BookDao;
import de.syngenio.lib.domainobject.Book;
import de.syngenio.lib.io.CharacterReader;

public class BookRentService implements IMenuChoiceService{

	private BookDao bookDao;
	
	public BookRentService(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	@Override
	public void optionSelected() {
		Collection<Book> booksFound = bookDao.findAllBooks();
		System.out.println("Folgende Buecher stehen zur Auswahl :");
		for (Book book : booksFound) {
			System.out.println("" + book);
		}
		System.out.println("Bitte waehlen Sie eine ID : ");
		Integer chosenBookId = null;
		try {
			chosenBookId = CharacterReader.readIntegerFromConsole();
		} catch (NumberFormatException e) {
			System.out.println("Auswahl ist ungueltig");
		}
		

		Book chosenBook = bookDao.findBookById(chosenBookId);
		if (chosenBook == null || chosenBook.isRented()) {
			System.out.println("Das Buch kann nicht gefunden werden, oder ist bereits verliehen.");
			return;
		}
		chosenBook.setRented(true);
		
		System.out.println("Sie haben " + chosenBook.getName() + " ausgeliehen.");
	}

}
