import java.util.*;
public class Employee {
    
    private int EmpID;
    private String EmpName;
    private int EmpSalary;

    private static int nextEmpID = 24001;

    public Employee(){
        this.EmpID = nextEmpID++;
        this.EmpName = "";
        this.EmpSalary = 0;
    }

    public Employee(String name, int salary){
        this.EmpID = nextEmpID++;
        this.EmpName = name;
        this.EmpSalary = salary;
    }

    public int getEmpId(){
        return EmpID;
    }

    public void printData(){
        System.out.println("Employee[EmpID= "+ EmpID 
                            + " Name= " + EmpName 
                            + " Salary=" + EmpSalary + " ]" );
    }


    public static void main(String[] args) {

        Employee[] Emp1 = new Employee[20];
        System.out.println();





































        // Employee Emp1 = new Employee();

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter the Name: ");
        // String empName = scanner.nextLine();
        

        // System.out.println("Please enter the Salary: ");
        // int salary = scanner.nextInt();

        // Emp1.printData();

        
        // Employee Emp2 = new Employee(empName, salary);
        // Emp2.printData();

        // scanner.close();
    }
}
