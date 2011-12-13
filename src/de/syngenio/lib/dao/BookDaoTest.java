package de.syngenio.lib.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.syngenio.lib.domainobject.Book;

public class BookDaoTest {

	private BookDao bookDao;

	@Before
	public void setup() {
		bookDao = new BookDao();
		createBook("test1", "111111");
		createBook("test2", "111111");	
	}
	
	@Test
	public void testRemoveBook() {
		assertEquals(2,bookDao.findAllBooks().size());
		bookDao.deleteBook(2);
		assertEquals(1,bookDao.findAllBooks().size());
	}

	private void createBook(String nameOfBook, String isbn) {
		Book bookToSave = new Book();
		bookToSave.setName(nameOfBook);
		bookToSave.setIsbn(isbn);
		bookDao.saveBook(bookToSave);
	}

}
