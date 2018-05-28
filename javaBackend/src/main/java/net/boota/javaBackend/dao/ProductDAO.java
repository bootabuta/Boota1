package net.boota.javaBackend.dao;

import java.util.List;

import net.boota.javaBackend.dto.Product;

public interface ProductDAO {
		
	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//  bussines Method
	
	List<Product> listActiveProduct();
	List<Product> listActiveProductByCategory(int categoryId );
	List<Product> getLatestActiveProduct(int count);
	
	
}
