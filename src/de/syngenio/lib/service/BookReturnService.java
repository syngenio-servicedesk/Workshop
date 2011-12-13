package de.syngenio.lib.service;

public class BookReturnService implements IMenuChoiceService{

	static void p(Object o) {
		System.out.println(o);
	}
	@Override
	public void optionSelected() {
		// throw new UnsupportedOperationException();
		p("Can't return books, please try again later");
	}

}
