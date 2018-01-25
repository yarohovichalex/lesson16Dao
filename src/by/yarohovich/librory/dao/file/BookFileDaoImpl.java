package by.yarohovich.librory.dao.file;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.yarohovich.librory.bean.Book;
import by.yarohovich.librory.dao.BookDao;

public class BookFileDaoImpl implements BookDao{
	private static int count = 0;
	@Override
	public void create(Book t) {
		count++;
		int i = 0;
		StringBuilder result = new StringBuilder();
	    String lineSeparator = System.getProperty("line.separator");
		try {
			//FileWriter fw1 = new FileWriter("C:\\Dell\\myTxt1.txt");
			FileWriter fw = new FileWriter("C:\\Dell\\myTxt1.txt", true);
			BufferedWriter bufferWriter = new BufferedWriter(fw);
			//fw.write(String.valueOf(result.append("\r\n").append(t.getTittle())));
			bufferWriter.write(String.valueOf(result.append("\r\n").append(t.getTittle())));
				//fw.write(t.getTittle());			
				//fw.write(String.valueOf(result.append("\r\n").append(t.getTittle())));		
            bufferWriter.close();
			fw.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

	@Override
	public Book read() {
		throw new UnsupportedOperationException("method was not implemented");
		
	}

	@Override
	public void update(Book t) {
		throw new UnsupportedOperationException("method was not implemented");
		
	}

	@Override
	public void delete(Book t) {
		throw new UnsupportedOperationException("method was not implemented");
		
	}

	@Override
	public List<Book> readAll()  {
		List <Book> books = new ArrayList<>();
		String string;
		String []stringArray ;		
			try {
				FileReader fr = new FileReader("C:\\Dell\\myTxt.txt");
				Scanner scan = new Scanner(fr);
				do {					
					string = scan.nextLine();
					stringArray = string.split(",");
					books.add(new Book(Integer.parseInt(stringArray[0]), stringArray[1]));					
				}while(scan.hasNextLine());
				fr.close();
				scan.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}		
		return books;		
	}	
}
