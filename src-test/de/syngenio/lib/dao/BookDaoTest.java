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
	public void testRemoveBookSize() {
		assertEquals(2,bookDao.findAllBooks().size());
		bookDao.deleteBook(2);
		assertEquals(1,bookDao.findAllBooks().size());
	}
	
	@Test
	public void testRemoveBookExactly() {
		assertEquals("test1",bookDao.findBookById(2).getName());
		bookDao.deleteBook(2);
		assertEquals(null,bookDao.findBookById(2));
	}
	
	private void createBook(String nameOfBook, String isbn) {
		Book bookToSave = new Book();
		bookToSave.setName(nameOfBook);
		bookToSave.setIsbn(isbn);
		bookDao.saveBook(bookToSave);
	}

}
