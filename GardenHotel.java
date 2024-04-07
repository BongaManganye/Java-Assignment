import java.util.Scanner;

public class GardenHotel {

    public static void main(String[] args) {
        //declare variables 
            int roomNo;
            double PRICE=800;
            double amtdue=0,payment,change;
            
            //create a scanner class to read infomation in the keyboard 
            Scanner sc =new Scanner(System.in);
            //promt for room capacity 
            System.out.print("Welcome To Gerdan Hotel enter your capacity one room  Room cost R800:");
            roomNo=sc.nextInt();
            //Calculate amount due 
            amtdue=PRICE*roomNo;
            
            //display amount due 
            System.out.println("Amount due is R"+amtdue);
            //make a payment 
            System.out.println("Make your payment ");
            payment=sc.nextDouble();
            
            if(payment>=amtdue){
                change=payment-amtdue;
                System.out.println("Change R"+change);
                System.out.println(" You have successful booked your room on the 5 April 2024");
            }else{
                System.out.println("Insufficient funds......");
            }
        }
        
    }