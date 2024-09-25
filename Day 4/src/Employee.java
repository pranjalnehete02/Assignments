import java.util.*;
public class Employee {
    //Data members
    private int EmpID;
    private String EmpName;
    private double EmpSalary;

	//globally initializing the ID 
    private static int nextEmpID = 24001;

	//Default Constructor
    public Employee(){
        this.EmpID = nextEmpID++;
        this.EmpName = "";
        this.EmpSalary = 0;
    }

	//Paramerterised Constructor
    public Employee(String name, double salary){
        this.EmpID = nextEmpID++;
        this.EmpName = name;
        this.EmpSalary = salary;
    }

	//As the ID is private and we need to access it 
    public int getEmpId(){
        return EmpID;
    }

	//this will print the details of the employee
    public void printData(){
        System.out.println("Employee[EmpID= "+ EmpID 
                            + " Name= " + EmpName 
                            + " Salary=" + EmpSalary + " ]" );
    }


    public static void main(String[] args) {
//creating the array of objects of 20 employee
        Employee[] Emp1 = new Employee[20];
        
//creating the scanner object from Scanner class/
		Scanner scanner = new Scanner(System.in);

//To track the number of employees added
		int count = 0;

//To check and store the choice
		int choice = 0;

//to continously asking for choice do-while loop
		do{
								//*******Menu card**********     
			System.out.println("*************MENU*************");
			System.out.println("1. Add Employee");
			System.out.println("2. Print Employee by empID");
			System.out.println("3. Print all Employee sorted by empID");
			System.out.println("0. Exit");


			//checking the choice
			choice = scanner.nextInt();
			switch(choice){
				case 1:{
				scanner.nextLine();
				System.out.println("Please enter the Employee name: ");
				String name = scanner.nextLine();

				System.out.println("Please enter Employee salary: ");
				double salary = scanner.nextDouble();
					//Saving the values of EMP2
				Employee Emp2 = new Employee(name, salary);

				//passing values to default constructor
				Emp1[count] = Emp2;
				count++;
				System.out.println("Employee added with empID : " + Emp2.getEmpId());
			}	break;

				case 2:{
					System.out.println("Enter the Employee ID:");
					int ID = scanner.nextInt();
					boolean found = false;

					for(int i = 0; i < count && !found; i++){
						//search by Employee ID
						if(Emp1[i].getEmpId() == ID){
							System.out.println("Employee Found");
							Emp1[i].printData();
							found = true;
						}
					}
					if( !found ){
						System.out.println("Employee NOT found !!");
					}
				}break;

				default:
					break;
			}


		}while(choice != 0);




        // Employee Emp1 = new Employee();

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter the Name: ");
        // String empName = scanner.nextLine();
        

        // System.out.println("Please enter the Salary: ");
        // int salary = scanner.nextInt();

        // Emp1.printData();

        
        // Employee Emp2 = new Employee(empName, salary);
        // Emp2.printData();

        scanner.close();
    }
}
