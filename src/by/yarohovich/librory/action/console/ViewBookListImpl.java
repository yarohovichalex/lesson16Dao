package by.yarohovich.librory.action.console;

import java.util.List;

import by.yarohovich.librory.action.BaseAction;
import by.yarohovich.librory.bean.Book;
import by.yarohovich.librory.dao.BookDao;
import by.yarohovich.librory.dao.file.BookFileDaoImpl;

public class ViewBookListImpl  implements BaseAction{
	
	//IoC
	private BookDao dao = new BookFileDaoImpl();

	@Override
	public void doSmth() {
		
		List<Book> books = dao.readAll();
		for(Book book: books) {
			System.out.println(book);
		}
		for (int i = 2; i < 5; i++) {
			dao.create(new Book(i, String.valueOf("BookName" + i)));
		}
		
	}

}
