/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment;

/**
 *
 * @author user
 */
public class Experiment {
   int i,j,n,count;
   
   void dupli(int array[]){
       for(i=0;i<array.length;i++)
       {
           for (j=i+1;j<array.length;j++)
           {
             if(array[j]==array[i])
                 
             {  
                 count++;
                 System.out.println("duplicate number :" +array[i]+ " ");
             }
           }
       }
       System.out.println("The number of duplicate numbers are " + count);
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Experiment obj = new Experiment();
        int arr[]={2,3,9,5,4,4,8,80,78,78};
        obj.dupli(arr);
    }
    
}
