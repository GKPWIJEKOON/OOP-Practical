

package com.mycompany.q5;


public class Q5 {

    public static void main(String[] args) {
        bankaccount b1=new bankaccount();
        b1.setdata(1230, 50000, "Tharindi");
        b1.diposit(0);
        b1.withdrowal(10000);
        b1.display();
       
       
        bankaccount b2=new bankaccount();
        b2.setdata(1238, 50000, "ruwan");
        b2.diposit(50000);
        b2.withdrowal(150000);
        b2.display();
        
        bankaccount b3=new bankaccount();
        b3.setdata(1125, 50000, "shehari");
        b3.diposit(50000);
        b3.withdrowal(10000);
        b3.display();
        
    }
}
