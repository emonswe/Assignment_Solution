
package air_traffic_controller;


public class Calculation {
    
    int[] x=new int[20];
    int y;
    Calculation(int x[],int y)
    {
        for (int i = 0; i < 20; i++) {
            x[i]=y;
        }
        
    }
    
    static double avarage(int x[])
    {
       double sum=0;
        for (int i = 0; i < 20; i++) {
            sum+=x[i];
        }
        
        return sum/20;
    }
    
    void grade(int x[]){
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Grade for Student "+i+1);
            
            if(x[i]>=80 && x[i]<=100)
        System.out.println("A");
        else if(x[i]>=70 && x[i]<80)
            System.out.println("B");
        else if(x[i]>=60 && x[i]<70)
            System.out.println("C");
        else if(x[i]>=50 && x[i]<60)
            System.out.println("D");
        else if(x[i]>=0 && x[i]<50)
            System.out.println("F");
        else
            System.out.println("Wrong Input!");
            
        }
         
    }
    
}
