package com.metanit;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        System.out.println("Hello Java!");
        int var1 ;
        int var2 ;
        var1 = 1024 ;
        System.out.println ("Переменная var1 содержит:" + var1 ) ;
        var2 = var1 / 2 ;
        System.out.print ("Переменная var2 содержит:" +var2);
         *//*
        String name = "Tom";
        int age = 31;
        float height = 1.7f;

        System.out.printf("Name: %s Age: %d Height: %.2f \n", name,age,height);
        *//*
        Scanner in=new Scanner(System.in);
        System.out.println("Input a number: ");
        int num=in.nextInt();

        System.out.println("Your number is  " +num);
        in.close();
        */Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number: ");
        int num=scanner.nextInt();

        System.out.println("Your number is  " +num);
        scanner.close();
    }

}