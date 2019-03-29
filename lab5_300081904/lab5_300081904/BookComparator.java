import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    // Implement the comparator method for books.
	public int compare(Book a, Book b){
        if(!(a.getAuthor().equals(b.getAuthor())) ){
            return a.getAuthor().compareTo(b.getAuthor());
        }
		else{
			if(!(a.getTitle().equals(b.getTitle())) ){
				return a.getTitle().compareTo(b.getTitle());
			}
			else{
				
				if(a.getYear() < b.getYear() ){
				return -1;
				}
				if(a.getYear() > b.getYear() ){
					return 1;
				}	
				return 0;
			}
		}
    }
}