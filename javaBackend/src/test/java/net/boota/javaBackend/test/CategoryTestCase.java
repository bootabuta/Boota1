package net.boota.javaBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.boota.javaBackend.dao.CategoryDAO;
import net.boota.javaBackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.boota.javaBackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	// Add a New Category
	/*
	 * @Test public void testAddCategory(){
	 * 
	 * category = new Category(); category.setName("Dry Fruits");
	 * category.setDescription("Fresh Dry Fruits Here !");
	 * category.setImageUrl("Veg_221.png");
	 * 
	 * assertEquals("Successfully Added category",true,
	 * categoryDAO.add(category));
	 * 
	 * }
	 */
	/*
	 * @Test public void testGetCategory(){
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * assertEquals("Successfully Fatched a Single category","Fruits",
	 * category.getName());
	 * 
	 * }
	 */
	/*
	 * @Test public void testUpdateCategory(){
	 * 
	 * category = categoryDAO.get(2);
	 * 
	 * category.setName("Paneer");
	 * 
	 * assertEquals("Successfully Update category",true,
	 * categoryDAO.update(category));
	 * 
	 * }
	 * 
	 */
	/*
	 * @Test public void testDeleteCategory(){
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * assertEquals("Successfully Delete category",true,
	 * categoryDAO.delete(category));
	 * 
	 * }
	 * 
	 */
	/*
	 * @Test public void testListCategory(){
	 * 
	 * assertEquals("Successfully Fatched List category",1,
	 * categoryDAO.list().size());
	 * 
	 * }
	 */

	@Test
	public void testCRUDCategory() {

		// adding category
		category = new Category();
		category.setName("Vegetable");
		category.setDescription("Fresh vegetable Here !");
		category.setImageUrl("Veg_221.png");
		assertEquals("Successfully Added category", true, categoryDAO.add(category));

		category = new Category();
		category.setName("Dry Fruits");
		category.setDescription("Fresh Dry Fruits Here !");
		category.setImageUrl("Veg_222.png");
		assertEquals("Successfully Added category", true, categoryDAO.add(category));

		
		// fatching and updating
		category = categoryDAO.get(2);
		category.setName("Paneer");
		assertEquals("Successfully Update category", true, categoryDAO.update(category));
		
		
		//delete a category
		category = categoryDAO.get(1); 
		assertEquals("Successfully Delete category",true,
		categoryDAO.delete(category));
		
		
		//fatching list category
		assertEquals("Successfully Fatched List category",1, categoryDAO.list().size());
		
		
	}
}
