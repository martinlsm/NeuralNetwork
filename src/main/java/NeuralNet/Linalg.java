package NeuralNet;

public class Linalg {
    public static double[] mul(double[][] A, double[] v) {
        double[] res = new double[A.length];
        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < v.length; ++j) {
                res[i] += A[i][j] * v[j];
            }
        }
        return res;
    }

    public static double[][] mul(double[][] A, double[][] B) {
        int I = A.length;
        int J = B.length;
        int K = B[0].length;
        double[][] res = new double[I][K];
        for (int i = 0; i < I; ++i) {
            for (int j = 0; j < J; ++j) {
                for (int k = 0; k < K; ++k) {
                    res[i][k] += A[i][j] * B[j][k];
                }
            }
        }
        return res;
    }

    public static void print(double[][] A) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < A.length; ++i) {
            sb.append("[");
            for (int j = 0; j < A[0].length; ++j) {
                sb.append(String.format("%5.2f", A[i][j]));
                if (j < A[0].length - 1) {
                    sb.append("  ");
                }
            }
            if (i < A.length - 1) {
                sb.append("]\n ");
            } else {
                sb.append("]");
            }
        }
        sb.append("]\n");
        System.out.print(sb.toString());
    }

    public static void print(double[] v) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < v.length; ++i) {
            sb.append(String.format("%5.2f", v[i]));
            if (i < v.length - 1) {
                sb.append("\n ");
            }
        }
        sb.append("]\n");
        System.out.print(sb.toString());
    }
}
