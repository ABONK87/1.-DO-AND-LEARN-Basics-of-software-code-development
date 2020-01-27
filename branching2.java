package Basics_of_software_code_development;

public class branching2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 99;
        int c = 15;
        int d = 25;
        int e = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(e);
    }
}
