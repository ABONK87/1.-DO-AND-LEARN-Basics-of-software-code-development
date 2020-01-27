package Basics_of_software_code_development;

public class branching4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int x = 3;
        int y = 4;
        int z = 5;
        if ((x * y) < (a * b) || (x * z) < (a * b) || (y * z) < (a * b)) {
            System.out.println("Кирпич пройдет через отверстие!");
        }
        else System.out.println("Кирпич не пройдет через отверстие!");
    }
}
