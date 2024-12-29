import java.util.Random;
import java.util.Scanner;

public class GuessingGame1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rando = new Random();
        int random = rando.nextInt(100) + 1;
        int i = 0;
        int num = 0;

        System.out.println("Guess a number between 1 and 100:");

        for(i=0;i<=num;i++){
         num=sc.nextInt();
    
        

        while (num != random) {
            
        

            if (num == random) {
                System.out.println(num + " is the right guess");
                System.out.println("Attempts taken: " + i);
                break;
    
            }
        
        
            else if (num < random) {
                System.out.println(num + " is too low. Try again.");
                
            } else if (num > random) {
                System.out.println(num + " is too high. Try again.");
                
            }
            break;
        }
       
       
       
       
       
       
       
       
       
        } 
        sc.close(); 
    }
}


