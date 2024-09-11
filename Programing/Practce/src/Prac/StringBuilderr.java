package Prac;

import java.lang.StringBuilder;

public class StringBuilderr {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder();

        sb.append("FUCK GOODS");

        String name = sb.toString();

        System.out.println(name.length());
        System.out.println(sb.capacity());

//        name.split(4);
        name.split(String.valueOf(4));
        System.out.println(name);
        String name1 = "Rami";
        String name2 = name1;
        name1 = "Qais";
        System.out.println(name2); // Qais
        System.out.println(name1);



    }
}
