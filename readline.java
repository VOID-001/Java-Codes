/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice21ce25;
import java.io.DataInputStream;
public class readline {
    public static void main(String args[])
    {
        DataInputStream in =new DataInputStream(System.in);
        int intNumber=0;
        float floatNumber=0.0f;
        try{
            System.out.println("Enter an integer");
            intNumber=Integer.parseInt(in.readLine());
            System.out.println("Enter a float number");
            floatNumber=Float.valueOf(in.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Input error"+e);
        }
        System.out.println("intNumber"+intNumber);
        System.out.println("floatNumber"+floatNumber);
    }
}
