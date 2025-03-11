import java.util.Scanner;
class ATM{
    float Balance=0.0f;
    int PIN=5674;// YOU CAN SET BY YOUR OWN 

  public  void checkhpin(){
    System.out.println("Enter your pin :");
    Scanner sc=new Scanner(System.in);
    int Enter_pin=sc.nextInt();
    int Enteredpin=Enter_pin;
    if(Enteredpin==PIN){
        menu();
    }
    else{
        System.out.println("Enter a Valid pin");
    }
    }

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. CHeck account balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. EXIT");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            DepositMoney();
        }
        else if(opt==4){
            System.out.println("process finished with exit code 0 ");
            return;
        }
        else{
            System.out.println("enter a valid choice");
            menu();
        }
    }
       
        public void checkBalance(){
            System.out.println("Balance:" + Balance);
            menu();
        }
        public void withdrawMoney(){
            System.out.println("enter amout to withdraw: ");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextInt();
            if(amount>Balance){
                System.out.println("Insufficient Balance:");
            }
            else{
                Balance=Balance-amount;
                System.out.println("amount withdrawl Succesfully");
            }
            menu();
    }

    public void DepositMoney(){
        System.out.println("enter the amount for depost ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextInt();
        Balance+=amount;
        System.out.println("amount has been deposited succeesfully 👍");
        menu();
    }

}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj=new ATM();

        obj.checkhpin();
  
    }
    
}
