import java.util.*;

public class commandLineIO {
    public static void main(String[] args) {
        if(args.length > 0){
            String name = args[0];
            System.out.println("Hello" + name + " !");
        } else {
            System.out.println("Please provide your name !");
        }
    }
}
