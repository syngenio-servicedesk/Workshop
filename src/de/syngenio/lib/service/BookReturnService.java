package de.syngenio.lib.service;

public class BookReturnService extends BookServiceBase{

	static void p(Object o) {
		System.out.println(o);
	}
	@Override
	public void optionSelected() {
		// throw new UnsupportedOperationException();
		p("Can't return books, please try again later");
	}

}
