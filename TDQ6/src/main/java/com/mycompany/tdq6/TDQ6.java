

package com.mycompany.tdq6;


public class TDQ6 {

    public static void main(String[] args)
    {
            char grade  = 'E';
             switch (grade) 
             {
              case 'A' :
                System.out.println("Excellent!");
                 break;
              case 'D':
                 System.out.println("You passed");
                 break;
              case 'F':
                 System.out.println("better try again");
                 break;
              case 'E':
                  System.out.println("invalid Grade");
                   break;
    
             }
 
            System.out.println("your grade is :"+grade);       
    }
}
