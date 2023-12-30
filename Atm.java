import java.util.Scanner;
class Atm{
    int Total_Amount=5000;
 void withdraw(int a1){
     if(Total_Amount>a1){
         System.out.println("Amount withdrawn:" + a1);
         Total_Amount=Total_Amount - a1; }
     else{
         System.out.println("Insufficient amount to withdraw");}     
 }
  void deposit(int a2){
   Total_Amount=Total_Amount+a2;
   System.out.println("Amount deposited:" + a2);} 
  void checkBalance(){
    System.out.println(" Balance amount:" + Total_Amount);}
}
class User{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Atm t=new Atm();
        while(true){
        System.out.println("Main menu:");
        System.out.println("Exit-0");
        System.out.println("Deposit-1");
        System.out.println("Withdraw-2");
        System.out.println("Check Balance-3");
        System.out.println("Enter your choice:");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Enter the amount:");
            int a=sc.nextInt();
            t.deposit(a);}
        else if(n==2){
            System.out.println("Enter the amount:");
            int a=sc.nextInt();
            t.withdraw(a);}
        else if(n==3){
            t.checkBalance();}
        else if(n==0){
            System.out.println("Thank you for visiting");
            break;}
        else{
            System.out.println("Invalid choice");}    
        }
    }
}