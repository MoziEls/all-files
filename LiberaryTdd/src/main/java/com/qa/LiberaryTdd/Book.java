package com.qa.LiberaryTdd;

public class Book {
	
	

	private String author;
	private String title;
	private String genre;
	private int numcopies;
	public Book( String author, String title, String genre, int  
			 numcopies)
			{ this.author = author;
			    this.title = title;
			    this.genre = genre;
			    this.numcopies = numcopies;
		}
		public String getAuthor()
	{
	    return author;
	}
	public String getTitle()
	{
	    return title;
	}
	public String getGenre()
	{
	    return genre;
	}
	public String toString()
	{
	    return  "\nAuthor: " +author + "\nTitle: " +title + 
	  "\nGenre: " +genre + "\nNumber Of Copies " +numcopies +"\n ";
	}

}
