
package air_traffic_controller;

import java.util.Scanner;


public class Air_Traffic_Controller {


    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int[] x = new int[20];
        System.out.println("Enter Number");
        for (int i = 0; i < 20; i++) {
            System.out.print("Student "+(i+1)+"-> ");
            x[i]=input.nextInt();
             
        }
        
        
                int sum=0;
        for (int i = 0; i < 20; i++) {
 
            sum+=x[i];
        }
        int avg=sum/20;
        System.out.println("Avarage: "+avg);
        System.out.println("Grade:");
       for (int i = 0; i < 20; i++) {
           
            
            if(x[i]>=80 && x[i]<=100)
        System.out.println("Student "+(i+1)+"A ");
        else if(x[i]>=70 && x[i]<80)
            System.out.println("Student "+(i+1)+"B ");
        else if(x[i]>=60 && x[i]<70)
            System.out.println("Student "+(i+1)+"C ");
        else if(x[i]>=50 && x[i]<60)
            System.out.println("Student "+(i+1)+"D ");
        else if(x[i]>=0 && x[i]<50)
            System.out.println("Student "+(i+1)+"F ");
        else
            System.out.println("Wrong Input!");
            
        }
    }           
}