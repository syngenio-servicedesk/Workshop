package de.syngenio.lib.service;

import de.syngenio.lib.dao.BookDao;
import de.syngenio.lib.domainobject.Book;
import de.syngenio.lib.io.CharacterReader;

public class BookReturnService implements IMenuChoiceService{

	static void p(Object o) {
		System.out.println(o);
	}
	@Override
	public void optionSelected() {
		// throw new UnsupportedOperationException();
		p("Geben Sie die ID des Buches ein:");
		Long bookId;
		try {
			bookId = CharacterReader.readLongFromConsole();
		}
		catch (NumberFormatException e){
			p("ungueltige Eingabe");
			return;
		}
		BookDao bookDao = new BookDao();
		Book book = bookDao.findBookById(bookId);
		if(book == null){
			p("Buch existiert nicht");
		}
		else if (!book.isRented()){
			p("Buch ist nicht ausgeliehen");
		}
		else{
			book.setRented(false);
			p("Buch wurde zurueckgegeben");
		}
	}

}
