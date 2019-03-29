import java.io.IOException;

public class RandomExceptions {

   public static void main(String args[]) {

      int exceptionNumber = randomNumber();

      try{
	        throwException(exceptionNumber);
      }
      // Your code here to catch exceptions one by one.
      /*if(exceptionNumber==1){
         
         catch(Exception e){
         
            System.out.println("The exception type is: Exception, the exceptionNumber is: 1");

         }
         
      }

      if(exceptionNumber==2){

         catch(ArrayIndexOutOfBoundsException e){
            
            System.out.println("The exception type is: ArrayIndexOutOfBoundsException, the exceptionNumber is: 2");

         }
      }

      if(exceptionNumber==3){

         catch(IOException e){
            
            System.out.println("The exception type is: IOException, the exceptionNumber is: 3");

         }
      }

      if(exceptionNumber==4){

         catch(IllegalArgumentException e){
            
            System.out.println("The exception type is: IllegalArgumentException, the exceptionNumber is: 4");

         }

      }
      if(exceptionNumber==5){

         catch(NullPointerException e){
            
            System.out.println("The exception type is: NullPointerException, the exceptionNumber is: 5");

         }
         
      }*/

      catch(Exception e){
         if (exceptionNumber==1){

            System.out.println("The exception type is: Exception, the exceptionNumber is: 1");

         }
         if (exceptionNumber==2){

            System.out.println("The exception type is: ArrayIndexOutOfBoundsException, the exceptionNumber is: 2");

         }
         if (exceptionNumber==3){

            System.out.println("The exception type is: IOException, the exceptionNumber is: 3");

         }
         if (exceptionNumber==4){

            System.out.println("The exception type is: IllegalArgumentException, the exceptionNumber is: 4");

         }
         if (exceptionNumber==5){

            System.out.println("The exception type is: NullPointerException, the exceptionNumber is: 5");

         }
      }
   }

   public static int randomNumber() {
      return (int)(Math.random()*5) + 1;
   }

   public static void throwException(int exceptionNumber) throws Exception, IOException{
      if(exceptionNumber==1){
          // Your code here
          throw new Exception();
      }
      if(exceptionNumber==2){
          // Your code here
          throw new ArrayIndexOutOfBoundsException();
      }
      if(exceptionNumber==3){
          // Your code here
          throw new IOException();
      }
      if(exceptionNumber==4){
          // Your code here
          throw new IllegalArgumentException();
      }
      if(exceptionNumber==5){
          // Your code here
          throw new NullPointerException();
      }
   }
}