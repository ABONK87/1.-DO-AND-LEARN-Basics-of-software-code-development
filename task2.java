package Basics_of_software_code_development;

public class task2 {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 2.0;
        double c = 1.5;
        double x = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3.0) * c + Math.pow(b, -2.0);
        System.out.println(x);
    }
}
