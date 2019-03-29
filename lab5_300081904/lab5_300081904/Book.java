public class Book{
	
	//Instance variables
	private String author;
	private String title;
	private int year;


	//Constructor
	public Book(String author, String title, int year){
	
		this.author = author;
		this.title = title;
		this.year = year;
	
	
	}

	public String getAuthor(){
	
		return author;
	
	}

	public String getTitle(){
	
		return title;
	
	}

	public int getYear(){
	
		return year;

	}

	public String toString(){
	
		return (author + ":" + title + "(" + year + ")");
	
	}

	public boolean equals(Object o){
	
		  return this == o;
	
	}





}