package by.yarohovich.librory.dao;

import java.util.List;

import by.yarohovich.librory.bean.Book;

public interface BookDao extends BaseDao<Book>{
	List<Book> readAll();
}
