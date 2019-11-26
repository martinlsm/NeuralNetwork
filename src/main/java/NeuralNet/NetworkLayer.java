package NeuralNet;

public interface NetworkLayer {
    double[][] forward(double[][] x);
    double[][] backward(double[][] y);
}
