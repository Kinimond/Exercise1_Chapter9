package com.company;

public class Main {

    public static void main(String[] args) {
        //1.1
        String word = "test";
        char word2 = 3;

        //1.4
        char x = 3;

        //1.5
        String empty = "";

        //1.1
        System.out.println(word + word2);
        //result is test can't display number.

        //1.4
        System.out.println(x++);
        //System.out.println(x = x + 1);
        //incompatible types: possible lossy conversion from int to char

        //1.5
        System.out.println("" + 5);
        //will simply display 5.


    }
}
