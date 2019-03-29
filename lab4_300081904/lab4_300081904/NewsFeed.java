/* *
 * Use static array for NewsFeed
 * with constant MAX_SIZE
 * */

public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;

    public NewsFeed() {
    	// Your code here.
		this.size = size;
		this.messages = new Post[MAX_SIZE];
		
    }

    public void add(Post message) {
      // Your code here.
	  
	  	messages[size] = message;
		size = size + 1;
	  
    }

    public Post get(int index) {
	     return messages[index];
    }

    public int size() {
	     return size;
    }

	  public void sort(){
			int i, j, argMin;
			Post tmp;
			for (i = 0; i < size - 1; i++) {
				argMin = i;
				for (j = i + 1; j < size(); j++) {
					if (messages[j].compareTo(messages[argMin]) < 0) {
						argMin = j;
					}
				}

  			tmp = messages[argMin];
  			messages[argMin] = messages[i];
  			messages[i] = tmp;
		  }

	  }

  	public NewsFeed getPhotoPost(){
  		// Your code here
		NewsFeed photos = new NewsFeed();
		for(int i = 0; i < size; i++){
			
			if(this.get(i) instanceof PhotoPost){
				
				photos.add(this.get(i));

			}
		}
		return photos;
  	}

  	public NewsFeed plus(NewsFeed other){

  	  // Your code here
	  NewsFeed Sum = new NewsFeed();

	  for(int i = 0; i < 25 ; i++){
		
		Sum.add(this.get(i));

	  }
	  
	  for(int i = 0; i < 25 ; i++){
		
		Sum.add(other.get(i));

	  }
	  
	  Sum.sort();
	  return Sum;

  	}

}
