package Basics_of_software_code_development;

public class cycle3 {
    public static void main(String[] args) {
        // сумма квадратов первых ста чисел
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += (long) (Math.pow(i, 2));
        }
        System.out.println(sum);
    }
}
