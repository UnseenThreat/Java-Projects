public class Arithmetic extends AbstractSeries {

    // instance variables
    int pos = 1;
    double sum = 0;
    //double[] = series = new series{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    
    public double next() {
        
        // implement the method
        /*if(pos == 0){
            return 1;
        }
        else{
            sum = 0;
            for(int i = pos; i < 0; i--){

              sum = sum + series[i];
              
            }
            
        }    
        pos = pos + 1;
        return sum;  */
        sum = pos + sum;
        pos = pos + 1;
        return sum;
    }
}