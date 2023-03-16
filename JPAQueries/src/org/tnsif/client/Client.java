package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		
	
		System.out.println("Total no.of books: "+service.getCount());
		
		
		System.out.println("Book with specific Id: "+service.getBookByIds(3));
		
		
		System.out.println("Price range between 300 to 600: "+service.getPrice(300f, 600f));
		
		
		System.out.println("Book with specific author: "+service.getBooksAuthor("karna"));
		
		System.out.println("All books: "+service.getAll());
	}

}
