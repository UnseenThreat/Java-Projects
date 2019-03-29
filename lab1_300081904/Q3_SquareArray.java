public class Q3_SquareArray{

    public static int[] createArray(int size) {

        int []myarray;
        myarray = new int[size];
        for(int i = 0; i  < myarray.length ; i++){

            myarray[i] = i * i;
        }
        return myarray;
    }

    public static void main(String[] args){
        int[] myarray = createArray(13);
        for(int i = 0; i < myarray.length; i++){

            System.out.println("The square of " + i + " is " + myarray[i]+".");
        }

    }
}