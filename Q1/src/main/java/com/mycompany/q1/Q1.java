

package com.mycompany.q1;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no1,no2,total;
        
        System.out.print("Enter the 1st number:");
        no1=sc.nextInt();
        
        System.out.print("Enter the 2nd number:");
        no2=sc.nextInt();
        
        total=no1+no2;
        System.out.println("Total is:"+total);
    }
}
