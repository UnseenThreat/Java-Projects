public class DynamicArrayStack<E> implements Stack<E> {

    // Instance variables

    private E[] elems;  // Used to store the elements of this ArrayStack
    private int top;    // Designates the first free cell
    private static final int DEFAULT_INC = 25;   //Used to store default increment / decrement

    @SuppressWarnings( "unchecked" )

    // Constructor
    public DynamicArrayStack( int capacity ) {
        // Your code here.
        this.elems = (E[]) new Object[ capacity ];
        this.top = 0;
    }

    // Gets current capacity of the array
    public int getCapacity() {
        return elems.length;
    }

    // Returns true if this DynamicArrayStack is empty
    public boolean isEmpty() {
        return ( top == 0 );
    }

    // Returns the top element of this ArrayStack without removing it
    public E peek() {
        return elems[ top-1 ];
    }

    @SuppressWarnings( "unchecked" )

    // Removes and returns the top element of this stack
    public E pop() {
        // Your code here.
         // pre-conditions: ! isEmpty()

        // *first* decrements top, then access the value!
        E saved = elems[ --top ];

        elems[ top ] = null; // scrub the memory!

        return saved;
        
    }

    @SuppressWarnings( "unchecked" )

    // Puts the element onto the top of this stack.
    public void push( E element ) {
        // Your code here.
        int num = 0;
        for(int i = 0; i < elems.length; i++){

            if(elems[i] != null){
                
                num = num + 1;

            }

        }

        if(num == elems.length - 1){

            E[] newElems;
            newElems = (E[]) new Object[this.getCapacity() + DEFAULT_INC];
            for(int i = 0; i < elems.length; i++){
                
                newElems[i] = elems[i];

            }
            elems[ top++ ] = element;
            this.elems = newElems;
        }
        else{

            elems[ top++ ] = element;

        }
        
    }

    @SuppressWarnings( "unchecked" )

    public void clear(){
        // Your code here.
        for(int i = 0; i < elems.length ; i++){

            this.pop();

        }
    }
}