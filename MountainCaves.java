import java.util.Scanner;
public class MountainCaves {
    public static void main(String[] args) {
        // declare variables 
        int  bookTitle;
        int option;
        //Scanner class 
        Scanner sc=new Scanner(System.in);
        
        //promt for options 
        System.out.println("Hello welcome to our library choose your option "+"\n"+
                           "1.list of available books "+"\n"+
                           "2.Borrowing book you use the number for book title eg sis(130)"+"\n"+
                           "3.Return book");
        option=sc.nextInt();
        
        //outcomes of the options 
        if(option==1){
            System.out.println("Available books book title is Maths(100)");
        }else if(option==2){
        System.out.println("Please Enter Yourbook Title ");
        bookTitle=sc.nextInt();
        
        if(bookTitle==100){
            System.out.println("The Book Title is available ");
        }else 
                System.out.println("Book Title "+""+bookTitle+" is not available .....");
        }else if(option==3){
            System.out.println("Thanks for returing our book good luck");
        }else{
            System.out.println("Invalid option......");
        }
    }
    
}
