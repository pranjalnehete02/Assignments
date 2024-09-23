import java.util.Scanner;
//package src;

public class sumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0; 
        for(int i = 0; i < n; i++){
        if(n < 0){
            return;
        }
        else{
            int digit = 0;
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
    }

    System.out.println(sum);

    }





    //                  ANOTHER LOGIC
    //     if (n > 0){
    //         System.out.println("Invalid");
    //         return;
    //     }

    //     int sum = 0;
    //     while (n > 0) {
    //         int digit = n % 10;
    //         sum = sum + digit;
    //         n = n / 10;
    // }

    // System.out.println(sum);
    
    // }
    

}



