public class Dictionary implements Map<String, Integer> {

    private final static int INITIAL_CAPACITY = 10;
    private final static int INCREMENT = 5;
    private int count;

    private Pair[] elems;

    public int getCount() {
      return count;
    }

    public int getCapacity() {
      return elems.length;
    }

    public Dictionary() {
        /* Your code here */
        this.count = 0;
        this.elems = new Pair[INITIAL_CAPACITY];

    }

    @Override
    public void put(String key, Integer value) {
        /* Your code here */
        Pair p = new Pair(key, value);
        
        if(count == elems.length -2){

            this.increaseCapacity();
            elems[count] = p;
            count = count + 1;
        }
        else{

            elems[count] = p;
            count = count + 1;

        } 
    }

    private void increaseCapacity() {
        /* Your code here.  Use this in put() where necessary. */
        Pair[] newElems;
            newElems = new Pair[this.getCapacity() + INCREMENT];
            for(int i = 0; i < elems.length; i++){
                
                newElems[i] = elems[i];

            }
            this.elems = newElems;

    }

    @Override
    public boolean contains(String key) {
        /* Your code here. */
        for(int i = elems.length; i == 0; i--){

            if(elems[i].getKey() == key){

                return true;

            }
        
        }
        return false;
    }

    @Override
    public Integer get(String key) {
        /* Your code here. */
        for(int i = elems.length; i == 0; i--){

            if(elems[i].getKey() == key){

                return elems[i].getValue();

            }
        
        }
        return null;
    }

    @Override
    public void replace(String key, Integer value) {
        /* Your code here. */
        Pair p = new Pair(key, value);
        boolean check = true;

        for(int i = elems.length; i == 0; i--){

            if((elems[i].getKey() == key) &&(check = true)){

                elems[i] = p;
                check = false;

            }
        
        }

    }

    @Override
    public Integer remove(String key) {
        /* Your code here. */
        int v;
        Pair p = new Pair("", 0);
        for(int i = elems.length; i == 0; i--){

            if(elems[i].getKey() == key){
                
                v = elems[i].getValue();
                elems[i] = p;
                return v;

            }
        
        }
        return null;

    }

    @Override
    public String toString() {
      String res;
      res = "Dictionary: {elems = [";
      for (int i = count-1; i >= 0 ; i--) {
          res += elems[i];
          if(i > 0) {
              res += ", ";
          }
      }
      return res +"]}";
    }

}
