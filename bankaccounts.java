import java.util.*;
interface machine{
    void withdraw(int amount);
    void deposit(int amount);
    void balance();
}
class atm implements machine{
    Scanner sc=new Scanner(System.in);
    public double balance_amt;
    atm(double balance_amt){
        this.balance_amt=balance_amt;
    }
    public void withdraw(int amount){
        if(amount<=balance_amt){
            System.out.println("Successful Transaction");
            balance_amt-=amount;
            System.out.println(balance_amt);
        }else{
            System.out.println("Failed Transaction\n"+" Check your balance");
           
        }
    }
    public void deposit(int amount){
        System.out.println("Successful Transaction");
        balance_amt+=amount;
    }
    public void balance(){
        System.out.println("Balance Amount\n"+balance_amt);
    }
}
class acc{
    public double balance_amt;
    private String name;
    acc(String name,double balance_amt){
        this.name=name;
        this.balance_amt=balance_amt;
    }
}
public class bankaccounts {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1.Please insert your card");
       System.out.println("2.Cancel");
       int start=sc.nextInt();
    if(start==1) {
        System.out.println("Enter your atm pin");
        String num=sc.next();
        if(num.matches("\\d+")){
            acc b=new acc(num, 0.0);
            atm a=new atm(0.0);
            while(true){
              System.out.println("1.Withdraw");
              System.out.println("2.Deposit");
              System.out.println("3.Check Balance");
              System.out.println("4.Cancel");
              int choice=sc.nextInt();
              int amt;
              switch(choice){
                case 1:
                System.out.println("1.Enter the amount to withdraw");
                amt=sc.nextInt();
                a.withdraw(amt);
                break;
                case 2:
                System.out.println("Enter the amount to deposit");
                amt=sc.nextInt();
                a.deposit(amt);
                break;
                case 3:
                a.balance();
                break;
                case 4:
                System.exit(0);
                break;
              }
            }
        }
    }else{
        System.exit(0);
    } 
    }
    }
 

