import java.util.Scanner;
public class ATM{
    public static void main(String[]args){
     double balance = 1000.0;
     int pin =12348;
     Scanner input = new Scanner(System.in);
     System.out.println("Welcome to The ATM System");   
     System.out.println("Please enter Your PIN");
     int enterpin =input.nextInt();
     if(enterpin != pin){
        System.out.println("Incorrect PIN. System shutting down.");
        return;                                                            }
        
        
        int Choice;


      do { 
            System.out.println("1:Check Balance");
            System.out.println("2:Deposit Money");
            System.out.println("3:Withdraw Money");
            System.out.println("4:Exit"); 
            System.out.println("Choose an option (1-4):");

            Choice =input.nextInt();

             switch (Choice){
             case 1: 
                System.out.print("Your current balance is: " );
                System.out.println(balance);
                break;
                
             case 2:
                    System.out.println("Enter amout to deposit:");
                    double depositAmount = input.nextDouble();
                    if(depositAmount > 0){
                        balance += depositAmount;
                        System.out.print("Successfully deposited. New balance: ");
                        System.out.println(balance);
                   }else{
                        System.out.println("Invalid amount.");       }
                         break;

             case 3:
                 System.out.println("Enter amount to withdraw");
                 double withdrawAmount = input.nextDouble();
                 if (withdrawAmount > 0 && withdrawAmount <= balance){
                  balance -= withdrawAmount;
                 System.out.print("Successfully withdraw. Ramaining balance: ");
                 System.out.println(balance);
                 }else if (withdrawAmount > balance){
                    System.out.println("Insufficient funds");
                 }else{
                     System.out.println("Invalid amount");
                      }
                        
             case 4:
                 System.out.println("Thank you for using our ATM. Goodbye");
                 break;

                 default:
                   System.out.println("Invalid choice. Please try again.");


             }
             
          }while (Choice != 4);
          input.close();

         }   
       }
 

