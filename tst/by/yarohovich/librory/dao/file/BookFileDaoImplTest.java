package by.yarohovich.librory.dao.file;

import static org.junit.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import by.yarohovich.librory.bean.Book;

public class BookFileDaoImplTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	//@Before
	
	@Test
	public void testReadAll() {		
		List <Book> books = new ArrayList<>();
		String string;
		String []stringArray ;		
			try {
				FileReader fr = new FileReader("C:\\Dell\\myTxt.txt");
				Scanner scan = new Scanner(fr);
				do {					
					string = scan.next();
					stringArray = string.split(",");
					books.add(new Book(Integer.parseInt(stringArray[0]), stringArray[1]));					
				}while(scan.hasNext());
				fr.close();
				scan.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		List<Book> al = new ArrayList<>();
		al.add(new Book(1,"Book1"));
		al.add(new Book(2,"Book2"));
		al.add(new Book(3,"Book3"));
		al.add(new Book(4,"Book4"));
		assertEquals(books, al);
		//return this.assertEcuals();
	}
	@Test
	public void testDelete(Book t) {
		
	}
	
	

}
