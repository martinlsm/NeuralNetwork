package neuralnet;

public interface LossFunction {
    double[] eval(double[] a);
    double[] grad(double[] a);
}
