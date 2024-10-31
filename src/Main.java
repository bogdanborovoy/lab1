import java.util.Random;
import static java.lang.Math.*;
public class Main {
    static double first(double a) {
        return pow(tan((a - 1) / 3) / 2, 2);
    }
    static double second(double a) {
        return atan(sin(a / (pow(exp(1), 2.0 / 3.0 - a))));
    }
    static double third(double a) {
        return pow((1.0/2.0)/asin(1/((pow(exp(1), pow(2/(pow(PI/abs(a), 2)), pow((sin(a)+1)/(4*a), pow((a*(a+1)), 2))))))), pow((pow(asin(((a+2)/2*10)/0.5),2)),((asin(cos(a))+4)/(asin(cos(a))))));
    }
    static void print_array(double[][] z1){
        for (int i=0; i < z1.length; i++)
        {
            for(int j=0; j < z1[i].length; j++) {
                System.out.printf("%.3f ", z1[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        short[] z = new short[18];
        for (short i=3; i<=20; i++){z[i-3] = i;}

        float[] x = new float[20];
        for (int i=0; i<=19; i++){
            int min_value = -8;
            int max_value = 12;
            float m = random.nextFloat()*(max_value-min_value+1) + min_value;
            while (m > 12) {
                m = random.nextFloat()*(max_value-min_value+1) + min_value;
            }
            x[i] = m;
        }

        double [][] z1 = new double[18][20];
        int[] array = {5, 6, 9, 11, 12, 14, 15, 17, 20};
        double x1;

        for (int i=0; i<=17;i++) {
            if (z[i] == 18)
            {
                for (int j = 0; j <= 19; j++) {
                    x1 = x[j];
                    z1[i][j] = first(x1);
                }
            }
        }

        for (int k=0;k<=8;k++)
        {
            for (int i=0; i <= 17;i++) {
                if (z[i] == array[k]) {
                    for (int j = 0; j <= 19; j++) {
                        x1 = x[j];
                        z1[i][j] = second(x1);
                    }
                }
            }
        }

        for (int i=0; i<=17;i++)
        {
            for (int j=0; j<=19;j++)
            {
                if (z1[i][j] == 0.0)
                {
                    x1 = x[j];
                    z1[i][j] = third(x1);
                }
            }
        }
        print_array(z1);
    }
}
