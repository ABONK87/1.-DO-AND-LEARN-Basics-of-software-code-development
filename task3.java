package Basics_of_software_code_development;

public class task3 {
    public static void main(String[] args) {
        double x = 60;
        double y = 45;
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
    }
}
