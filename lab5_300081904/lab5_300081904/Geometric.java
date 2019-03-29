public class Geometric extends AbstractSeries {

    // instance variables
    int pos = 1;
    double sum = 1;

    public double next() {

        // implement the method
        if (pos == 1){
            pos = pos + 1;
            return sum;
        }
        else{
        sum = sum +  Math.pow(Math.pow(2, (pos - 1)), -1);
        pos = pos + 1;
        return sum;
        }
    }
}