package Basics_of_software_code_development;

import com.sun.jdi.Value;

public class task4 {
    public static void main(String[] args) {
        //1 способ
        double r = 687.251;
        String d = String.valueOf(r);
        //String e = d.substring(d.indexOf('.') + 1);
        //2 способ
        String c = String.valueOf((int) (r / 1));
        String e = String.valueOf((int) ((r * 1000) % 1000));
        System.out.println(e);
        System.out.println(e + '.' + c);
    }
}
