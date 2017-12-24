package net.boota.javaBackend.dao;

import java.util.List;

import net.boota.javaBackend.dto.Category;

public interface CategoryDAO {
	
	
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
}
