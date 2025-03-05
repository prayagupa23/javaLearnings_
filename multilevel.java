//program in java to implement multilevel inheritance
import java.util.Scanner;
class account{
    int acc_no;
    float acc_bal;
    account(int ano, float bal){
        acc_no= ano;
        acc_bal= bal;
    }
    void display(){
        System.out.println("Account Number: "+acc_no);
    }
}
class savings extends account{
    float interest_rate;
    float principal;
    float roi;
    int years;
    savings(int ano, float bal, float p, float r, int y){
        super(ano,bal);
        principal= p;
        roi= r;
        years= y;
    }
    void deposit(float amt){
        acc_bal+= amt;
    }
    void withdraw(float amt){
        acc_bal-=amt;
    }
    void cal_interest(){
        interest_rate= (principal*roi*years)/100;
    }
    void display(){
        super.display();
        System.out.println("Interest Rate: "+interest_rate);
    }
}
class current extends savings{
    Boolean chequeBookIssue;
    current(int ano, float bal, float p, float r, int y, Boolean op){
        super(ano,bal,p,r,y);
        chequeBookIssue= op;
    }
    void withAmt(float amt) {
        acc_bal -= amt;
    }
    void display(){
        super.display();
        System.out.println("Updated Account Balance: "+acc_bal);
        System.out.println((chequeBookIssue==true)?"Chequebook is Issued!":"Chequebook is pending!");
    }
}
class multilevel{
    public static void main(String args[]){
        int choice;
        Scanner s1= new Scanner(System.in);
        current c1= new current(1011,1501.50f,3015.55f,2.3f,5,true);
        System.out.println("Enter your choice:\n1.Deposit\n2.Withdraw from Current\n3.Withdraw from Savings");
        choice= s1.nextInt();
        if(choice==1){
            c1.deposit(100.50f);
        }
        else if(choice==2){
            c1.withAmt(101.55f);
        }
        else{
            c1.withdraw(102.16f);
        }
        c1.cal_interest();
        c1.display();
    }
}