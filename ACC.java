
package air_traffic_controller;


public class ACC {
    public static void main(String[] args) {
        
        Account a=new Account();
        Account b=new Account(1122,20000,4.5);
        b.withdraws(2500);
        b.balance();
        System.out.println(b.getMonthlyInterestRate());
        b.getdate();
        b.deposit(3000);
        b.balance();
        System.out.println(b.getMonthlyInterestRate());
        b.DisplayInfo();
        
    }
    
}
