package NeuralNet;

import java.util.Random;

public class DenseLayer implements NetworkLayer {

    private static Random rand = new Random();

    private double[][] w;   // [neuron input][neuron output]
    private double[] b;     // [neuron output]
    private ActivationFunction activationFunction;

    public DenseLayer(ActivationFunction activationFunction, int inputDim, int outputDim) {
        this.activationFunction = activationFunction;
        w = new double[inputDim][outputDim];
        b = new double[outputDim];
        randomizeWeights();
    }

    private void randomizeWeights() {
        Linalg.print(w);
        int M = w.length;
        int N = w[0].length;
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < N; ++j) {
                w[i][j] = 2 * rand.nextDouble() - 1;
                b[j] = 2 * rand.nextDouble() - 1;
            }
        }
    }

    @Override
    public double[][] forward(double[][] x) {
        double[][] a = Linalg.mul(x, w);
        addBias(a, b);
        double[][] y = activationFunction.eval(a);
        return y;
    }

    @Override
    public double[][] backward(double[][] y) {
        return new double[0][];
    }

    private void addBias(double[][] a, double[] b) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                a[i][j] += b[j];
            }
        }
    }
}
