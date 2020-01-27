package Basics_of_software_code_development;

public class branching3 {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 1;
        int x3 = 1;
        int y1 = 3;
        int y2 = 5;
        int y3 = 6;
        if (((y3 - y1) * (x2 - x1) == ((x3 - x1) * (y2 - y1)))) {
            System.out.println("Точки лежат на одной прямой");
        }
        else System.out.println("Точки не лежат на одной прямой");
    }
}
