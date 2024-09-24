import java.util.Scanner;

public class Student {
    
        private int stdRoll;
        private String stdName;
        private String stdDep;

        private static int nextstdRoll = 24001;

        public Student(){
            this.stdRoll = nextstdRoll++;
            this.stdName = "";
            this.stdDep = "";
        }

        public Student(int stdRoll, String stdName, String stdDep){
            this.stdRoll = nextstdRoll++;
            this.stdName = stdName;
            this.stdDep = stdDep;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Student Std1 = new Student();
            
            System.out.println("Enter Student Name: ");
            Std1.stdName = sc.nextLine();

            System.out.println("Enter the Department: ");
            Std1.stdDep = sc.nextLine();

            System.out.println("Student[Name = " + Std1.stdName + 
                                ", Roll No =" + Std1.stdRoll + ", Department =" + Std1.stdDep + " ] " );
        }

}
