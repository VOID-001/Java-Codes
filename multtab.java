/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice21ce25;

/**
 *
 * @author student
 */

public class multtab {
    final static int ROWS=10;
    final static int COLUMNS=10;
    
    public static void main(String args[])
    {
        int product[][]=new int[ROWS][COLUMNS];
        System.out.println("Multiplication Table");
        System.out.println("  ");
        int i,j;
        for(i=1;i<ROWS;i++)
        {
            for(j=1;j<COLUMNS;j++)
            {
                product[i][j]=i*j;
                System.out.print("   "+product[i][j]);
            }
            System.out.println("  ");
        }   
    }
}
