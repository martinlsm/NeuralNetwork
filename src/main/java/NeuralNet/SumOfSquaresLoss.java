package NeuralNet;

public class SumOfSquaresLoss implements LossFunction {
    @Override
    public double eval(double[][] y, double d[][]) {
        int N = y.length;   // the number of outputs
        double sum = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < y[0].length; ++j) {
                double diff = y[i][j] - d[i][j];
                sum += 1.0 / (2 * N) * diff * diff;
            }
        }
        return sum;
    }

    @Override
    public double[] grad(double[] y) {
        return new double[0];
    }
}
