package Basics_of_software_code_development;

import java.util.Scanner;

public class cycle1 {
    public static void main(String[] args) {
        Scanner numbersOfStars = new Scanner(System.in);
        int x = numbersOfStars.nextInt();
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
