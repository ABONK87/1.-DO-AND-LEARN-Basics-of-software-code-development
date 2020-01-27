package Basics_of_software_code_development;

public class branching1 {
    public static void main(String[] args) {
        int corner1 = 45;
        int corner2 = 45;
        int corner3 = 180 - corner1 - corner2;
        if (corner3 > 0) {
            if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
                System.out.println("Треугольник существует и он прямоугольный");
            }
            else System.out.println("Треугольник существует");
        }
        else System.out.println("Треугольник не существует");

    }
}
