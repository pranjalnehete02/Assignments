import java.util.Scanner;
//package src;

public class RecuSeries {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            int series = i*(i-1);
            System.out.print(series + " ");
        }

    }
}
