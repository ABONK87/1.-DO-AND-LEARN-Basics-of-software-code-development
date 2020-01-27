package Basics_of_software_code_development;

public class task5 {
    public static void main(String[] args) {
        int t = 36450;
        int hh = t / 3600;
        int mm = (t - hh * 3600) / 60;
        int ss = (t - hh * 3600 - mm * 60);
        System.out.println(hh + "ч " + mm + "мин " + ss + "сек.");
    }
}
