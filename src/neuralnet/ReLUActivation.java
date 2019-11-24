package neuralnet;

public class ReLUActivation implements ActivationFunction {
    @Override
    public double[][] eval(double[][] a) {
        int M = a.length;
        int N = a[0].length;
        double[][] y = new double[M][N];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                y[i][j] = a[i][j] > 0 ? a[i][j] : 0;
            }
        }
        return y;
    }
}
