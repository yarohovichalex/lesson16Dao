package by.yarohovich.librory.dao;

import by.yarohovich.librory.bean.Entity;

public interface BaseDao<T extends Entity> {
	// C R U D
	void create(T t);
	T read();
	//List<> readAll();
	void update(T t);
	void delete(T t);
	
}
