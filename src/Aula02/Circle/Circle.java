import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double raio,area;
        Scanner in = new Scanner(System.in);

        raio = in.nextDouble();
        area = PI * Math.pow(raio,2);

        System.out.printf("A=%.4f\n",area);
    }
}
