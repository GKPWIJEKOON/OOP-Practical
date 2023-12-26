
package com.mycompany.q5;

public class bankaccount { //data
    private int accno;
    private float balance,diposit,withdrowal;
    private String accname;
    
    public void setdata(int accno,float balance,String accname)
    {
        this.accno=accno;
        this.balance=balance;
        this.accname=accname;
        
    }
    public void diposit(float d)
    {
        balance=balance+d;
    }
    public void withdrowal(float w)
    {
          if(w<=balance){
              balance =balance-w;
          }else { 
              System.out.println("Your amount is not avalable");
          }
          
          
          
    }
    public float checkbalance()
    {
        return balance;
        
    }
    public void display()
    {
        System.out.println("Account No:"+accno);
        System.out.println("Account holder's name :"+accname);
        System.out.println("Now your balance is:"+balance);
    }  
  
}