
package com.mycompany.q4;


public class Rectangale {
    //data
    private float width,height,area;
    
    public void setdata(float width,float height)
    {
        this.height=height;
        this.width=width;
        
    }
    public void display()
    {
        area=width*height;
        System.out.println("Area is:"+area);
        
    }
}
