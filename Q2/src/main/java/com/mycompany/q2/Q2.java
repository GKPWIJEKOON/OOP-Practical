
package com.mycompany.q2;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int byear,age;
        
        System.out.print("Enter the your name:");
        name=sc.nextLine();
        
        System.out.print("Enter yoyr birth year:");
        byear=sc.nextInt();
        
        age=2023-byear;
        System.out.print("your age is:"+age);
    }
}
