package NeuralNet;

public class Main {
    public static void main(String[] args) {
        double[][] x = {{1,2,3},{4,5,6}};
        NetworkLayer layer = new DenseLayer(new ReLUActivation(), 3, 4);
        Linalg.print(layer.forward(x));
    }
}