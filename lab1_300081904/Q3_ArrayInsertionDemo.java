public class Q3_ArrayInsertionDemo{

    public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
        int [] afterArray;
        afterArray = new int[(beforeArray.length + 1)];
        for(int i = 0; i < afterArray.length; i++){
            if(i == indexToInsert){
                afterArray[i] = valueToInsert;
            }
            else if(i < indexToInsert){
                afterArray[i] = beforeArray[i];
            }
            else{
                afterArray[i] = beforeArray[i-1];
            }

        }
        return afterArray;
    }

    public static void main(String[] args){
        int [] beforeArray;

        beforeArray = new int[]{1,5,4,7,9,6};

        System.out.println("Array before insertion:");
        for(int i = 0; i < beforeArray.length; i++){

            System.out.println(beforeArray[i]);
        }
        beforeArray = insertIntoArray(beforeArray, 3, 15);
        System.out.println("Array after insertion of 15 at position 3");
        for(int i = 0; i < beforeArray.length; i++){

            System.out.println(beforeArray[i]);
        }
    }
}