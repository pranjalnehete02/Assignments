package src;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        int principal = scanner.nextInt();
        System.out.println("Enter the rate of interest: ");
        int Interest = scanner.nextInt();
        System.out.println("Enter the time Time: ");
        int Time = scanner.nextInt();

        System.out.println("Enter which interest you want to calcilate: \n 1.Simple Interst \n2.Compound Interst");
        int choice = scanner.nextInt();

        //int y;
        switch(choice){
            
            case 1:
            double simpleInterest = (principal * Interest * Time) / 100;
            System.out.println("Simple Interest is: " + simpleInterest);
            break;

            case 2:
            //Principal (1 + Interest)Time − Principal
                int x = (1 + (Interest)/100);
                for(int i = 0; i < Time; i++){
                    x = x*x;
                }
                int z = (principal*x)*Time;
                int compoundInterest = z - principal;
                System.out.println("Compund Interest is: " + compoundInterest);
                break;

            default:
                System.out.println("Enter the valid choice.");
        }

            scanner.close();
    }    
}
