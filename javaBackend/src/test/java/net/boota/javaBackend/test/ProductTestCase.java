package net.boota.javaBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.boota.javaBackend.dao.ProductDAO;
import net.boota.javaBackend.dto.Product;

public class ProductTestCase {
	
		private static AnnotationConfigApplicationContext context;
		
			public static ProductDAO productDAO;
			
			private Product product;
			
			@BeforeClass
			public static void init() {
				
				context = new AnnotationConfigApplicationContext();
				context.scan("net.boota.javaBackend");
				context.refresh();
				productDAO = (ProductDAO)context.getBean("productDAO");
				
			}
		/*
			@Test
			public void testCRUDProduct() {
				
				// create operation
				product = new Product();
				
				product.setName("Oppo Selfie S53");
				product.setBrand("Oppo");
				product.setDescription("This is Oppo Selfie S53 oppo brand mobile phone.");
				product.setUnitPrice(25000);
				product.setActive(true);
				product.setCategoryId(3);
				product.setSupplierId(3);
				
				assertEquals("something went wrong when inserting product",
						true,productDAO.add(product));
				
				// reading and updating the category
				
				product = productDAO.get(2);
				product.setName("Samsung Galaxy S7");
				
				assertEquals("something went wrong when inserting product",
						true,productDAO.update(product));
				
				// delete product
				assertEquals("something went wrong when inserting product",
						true,productDAO.delete(product));
				
				// list
				assertEquals("something went wrong when inserting product",
						6,productDAO.list().size());
				
				
			}
			
			
			
			@Test
			public void testListActiveProduct() {
				
				assertEquals("something went wrong when inserting product",
						5,productDAO.listActiveProduct().size());
				
			}
			
			
			@Test
			public void testListActiveProductByCategory() {
				
				assertEquals("something went wrong when inserting product",
						3,productDAO.listActiveProductByCategory(3).size());
				
				assertEquals("something went wrong when inserting product",
						2,productDAO.listActiveProductByCategory(1).size());
				
			}
			*/
			
			
			@Test
			public void LtestGetLatestActiveProduct() {
				
				assertEquals("something went wrong when inserting product",
						3,productDAO.getLatestActiveProduct(3).size());
				
			}
			
}
