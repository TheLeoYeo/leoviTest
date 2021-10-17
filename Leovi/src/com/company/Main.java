package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("type first Binary number here");
        String num1 = sc.nextLine();
        System.out.println("type the 'type' of binary number here (us,s,oc,tc, defaults to us)");
        String type1 = sc.nextLine();
        Binary bin1= new Binary(num1,type1);

        System.out.println("type second Binary number here");
        String num2 = sc.nextLine();
        System.out.println("type the 'Type' of binary number here (us,s,oc,tc, defaults to us)");
        String type2 = sc.nextLine();
        Binary bin2= new Binary(num2,type2);


        System.out.println("type the 'Type' of binary number you plan to create!");
        String newType = sc.nextLine();
        Adder adder = new Adder();
        Binary num = adder.add(bin1,bin2,newType);
        System.out.println(num.getNumber());

        sc.close();
    }
}

