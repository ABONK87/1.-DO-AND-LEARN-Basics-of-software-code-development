package Basics_of_software_code_development;

public class cycle4 {
    public static void main(String[] args) {
        // произведение квадратов первых двухсот чисел
        double multi = 1.0;
        for (double i = 1.0; i <= 200.0; i = i + 1.0) {
            multi = multi * (Math.pow(i, 2));
            System.out.println(multi);
        }
        System.out.println(multi);
    }
}
