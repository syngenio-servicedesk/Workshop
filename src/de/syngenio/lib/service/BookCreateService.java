package de.syngenio.lib.service;

import de.syngenio.lib.domainobject.Book;
import de.syngenio.lib.io.CharacterReader;

public class BookCreateService extends BookServiceBase{

	
	
	@Override
	public void optionSelected() {
		System.out.println("Neues Buch anlegen.");
		String name = CharacterReader.readString("Name:");
		String isbn = CharacterReader.readString("ISBN:");
		Book bookToSave = new Book();
		bookToSave.setName(name);
		bookToSave.setIsbn(isbn);
		bookDao.saveBook(bookToSave );
	}

}
