
package air_traffic_controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
   private int id=0;
   private double balance=0.0;
   private double annualInter=0;
   private java.util.Date dateCreated;
   
   Account(){
       id=0;
       balance=0;
   }
   
   Account(int id,double balance,double annualInter){
       this.id=id;
       this.balance=balance;
       this.annualInter=annualInter;
      
   }
 
   double deposit(int x)
   {
      return balance+=x;
   }
   double withdraws(int x){
       return balance-=x;
   }
  double getMonthlyInterestRate(){
      return (annualInter*balance)/1200;
  }
  void getdate(){
      Date date=new Date();
        
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/YYYY");
        
        String DateTest=DateFormat.format(date);
        System.out.println(date);
      
  }
  void balance(){
      System.out.println("balance "+balance);
  }
  void DisplayInfo(){
      System.out.println("ID: "+id+" Balance: "+balance);
  }

}