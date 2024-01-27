/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice21ce25;

class secondClass{
    int a,b;
    void getdata(int x,int y)
    {
        a=x;
        b=y;
        System.out.println("a = " +a+"\nb = " +b);
        //System.out.println("b = " +b);
    }
}
public class twoClasses {
    public static void main(String args[])
    {
        secondClass c = new secondClass();
        c.getdata(5 , 10);
        
    }
}
