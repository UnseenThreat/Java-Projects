import java.util.Date;
public class NewsFeedApplication{

	public interface Likeable{
	
		public void like();
		
		public int getLikes();
	
	
	}
	
	public interface Comparable{
	
		public int compareTo();
		public boolean isPopular();
	
	
	}

	public class Post implements Likeable, Comparable{
	
		String username;
		int likes = 0;
		Date timestamp; 
		//timestampstring = timestamp.toString();
		public Post(String username){
			

			this.username = username;
			this.likes = likes;
			this.timestamp = Calendar.getInstance().getTime()
		
		
		}	
		public void like(){
		
			likes = likes + 1;
			
		}

		public int getLikes(){
		
			return likes;
		
		}
	
		public int compareTo(Post a){
		
			if(this.timestamp == a.timeStamp){
				
				return 0;

			}
			if(this.timeStamp > a.timeStamp){
			
				return 1;
			
			}

			return -1;
			

		}
		
		public boolean isPopular(){
		
			if(likes > 100){
			
				return true;
			
			}
			
			return false;

		}
		
		public String toString(){
		
			return ("Username: " + username + "|" + "Likes: " + count + "|" + "Time: " + timeStampString);
		
		
		}
	}


	public class PhotoPost extends Post{
		String username;
		int likes = 0;
		Date timestamp; 
		String filename
		String caption;
		public Photopost(String username, String filename, String caption){
			
			super(username)
			this.filename = filename;
			this.caption = caption
		}
	
	
		public String toString(){
		
			return (super.toString() + "|" + "Filename: " + filename + "|" + "Caption: " + caption);

		}

	}

	public class TextPost extends Post{
		String username;
		int likes = 0;
		Date timestamp; 
		String text;

		public Textpost(String username, String text){
			
			super(username)
			this.text = text;
			
		}
	
	
		public String toString(){
		
			return (super.toString() + "|" + "Text: " + text);

		}

		public boolean isPopular(){
		
			if(likes > 50){
				return true;
			}
		
		}
	
	}
	
	public class Newsfeed{
		public static final int MAX_SIZE = 25;
		Post[] posts = new Post[MAX_SIZE];
		int postnumber = 0;

		public Newsfeed(Post[] posts){
			
			this.posts = posts;
		
		}

		public void add(Post a){
			
			if(postnumber < 25){
			
			posts[postnumber] = a;
			postnumber = postnumber + 1;

			}
			
		
		}

		public Post get(int index){
		
			return posts[index];
		
		}

		public int size(){

			return postnumber;

		}
	
	}
}