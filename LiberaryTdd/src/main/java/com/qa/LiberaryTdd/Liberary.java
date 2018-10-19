package com.qa.LiberaryTdd;

import java.util.ArrayList;
import java.util.List;

public class Liberary {
	

//	public void addBook(Book book)
//	{
//		bookCollection.add(book);
//	}

	public String searchTitle(String titleSearch) {
	    List<Book> bookCollection = new ArrayList<Book>();

	    if (titleSearch == null) return "\n No Books Avaliable ";
	    for(int i = 0; i < bookCollection.size(); i++){
	        if(titleSearch.equalsIgnoreCase(bookCollection.get(i).getTitle())){
	            return bookCollection.get(i).toString();
	        }
	    }
	    return "\n No Books Avaliable "; //reachable only if no book found
	}
}
