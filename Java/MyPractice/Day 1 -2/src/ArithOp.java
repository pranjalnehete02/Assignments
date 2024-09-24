import java.util.Scanner;

public class ArithOp{
    public static void main(String[] args) {
        
        System.out.println("Enter numbers: ");

        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        

        while(true){
            System.out.println("Enter the choice for the Arrithmetics: \n1.Addition \n2.Substraction \n3.Multiplication \n4.Division \n5.Exit");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                System.out.println("Addition of two numbers: "+(num1+num2));
                break;

                case 2:
                System.out.println("Subtraction of two numbers: "+(num1-num2));
                break;

                case 3:
                System.out.println("Multiplication of two numbers: "+ (num1*num2));
                break;

                case 4:
                System.out.println("Division of the two numbers: "+(num1/num2));
                break;

                case 5:
                return;

                default:
                System.out.println("Invalid Choice. Please try again !!");

            }
        }
    }

}


