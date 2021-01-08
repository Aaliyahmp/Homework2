package com.tts;

public class AsciiChars {
    public static void printNumbers()
    {
        System.out.println("Valid input numbers");
        for( char i = 0; i <=57; i++)
            System.out.println(i);
    }


    public static void printLowerCase()
    {
        System.out.println("List of alphabets in lowercase :");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.printf("%s ", ch); }


    }

    public static void printUpperCase()
    {
        System.out.println("\nList of alphabets in upper case :");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.printf("%s ", ch); }



    }
}
