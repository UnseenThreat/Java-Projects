import java.util.Calendar;
import java.util.Date;

public class Post implements Likeable, Comparable<Post> {

    protected int likes;
    private Date timeStamp;
    private String userName;

    public Post(String userName) {
      // Your code here
	  this.userName = userName;
	  this.likes = likes;
	  this.timeStamp = Calendar.getInstance().getTime();
    }

    public String getUserName() {
	     return userName;
    }

    public Date getTimeStamp() {
	     return timeStamp;
    }

    // Implement the methods required by the interface Likeable.
    // This file will not compile unless they are present with the correct name and signature.
	public void like(){
		
			likes = likes + 1;
			
    }

	public int getLikes(){
		
			return likes;
		
	}
	
    public String toString() {
    	String str = new String();
    	str = getClass().getName() + ": " + timeStamp + ", " + userName + ", likes = " + likes;
    	return  str;
    }


  	public int compareTo(Post other){
  		// Your code here.
			if((this.getTimeStamp().getTime()) > (other.getTimeStamp().getTime())){
				
				return 1;

			}
			if((this.getTimeStamp().getTime()) < (other.getTimeStamp().getTime())){
			
				return -1;
			
			}

			return 0;

			//return this.timeStamp.compareTo(other.timeStamp);
			
  	}

  	public boolean isPopular(){
  		// Your code here.
		if(likes > 100){
			
			return true;
			
		}
			
			return false;

  	}

}
