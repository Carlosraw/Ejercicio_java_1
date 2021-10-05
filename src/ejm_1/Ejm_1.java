/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejm_1;

/**
 *
 * @author user
 */
public class Ejm_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Este programa recrea la serie Fibonacci
        //x,y,z
        //1,2,3,5,8,13,21,34
        int sum1=0, sum2=1, resp=0, x, y, z;
        for (int cont=1; cont<=20; cont++)
        {
            
            
            sum1=sum2;
            sum2=resp;
            resp=sum1+sum2;
            
            
            System.out.println(resp);
        }
        
        }
            
    

}
