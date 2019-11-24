import neuralnet.DenseLayer;
import neuralnet.Linalg;
import neuralnet.NetworkLayer;
import neuralnet.ReLUActivation;

public class Main {
    public static void main(String[] args) {
        double[][] x = {{1,1}};
        NetworkLayer layer = new DenseLayer(new ReLUActivation(), 2, 2);
        Linalg.print(layer.forward(x));
    }
}
