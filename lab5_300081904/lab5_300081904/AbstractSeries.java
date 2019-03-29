public abstract class AbstractSeries implements Series {

    public double[] take(int k) {

        // implement the method
        double[] numbers = new double[k];
        for(int i = 0; i < k ; i++){

            numbers[i] = this.next();
        }
        return numbers;

    }

}