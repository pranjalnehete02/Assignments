package DstoreTester;

import dStore.Dstore;
import java.util.Arrays;
import java.util.Scanner;
import DstoreTester.ItemArray;

public class CustomerArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		Dstore ca[] = new Dstore[10];
		// ItemArray ia= new ItemArray();

		Dstore iarr[] = { new Dstore("Toothpaste", 56.0), new Dstore("Chips", 20.0), new Dstore("Bucket", 100.0),
				new Dstore("Chocolate", 20.0), new Dstore("ColdDrink", 30.0) };
		
		while (true) {
			System.out.println("***MENU***");
			
			System.out.println("Choose action:");
			System.out.println("1. Display stock.");
			System.out.println("2. Add Item to cart.");
			System.out.println("3. Calculate Price.");
			int choice = sc.nextInt();
			String ch = "";
			boolean exit = true;
			boolean check=false;
			
			switch (choice) {
			
			
			case 1:
			{
				System.err.println("Items present in stock are :");
				for(int i=0;i<iarr.length;i++) {
					System.out.println(iarr[i].getItemCode()+". "+iarr[i].getItemname()+" ,Price: "+iarr[i].getPrice());
				}
			}
			break;
			case 2:
			{
				do {
					System.out.println("Enter Item code:");
					int icode=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter quantity:");
					int iq=sc.nextInt();
					
					for(int i=0;i<iarr.length;i++) {
						
					
					if(icode == iarr[i].getItemCode()) {
						
				
						ca[count]=iarr[i];
						iarr[i].setQuantity(iq);
						count=count+1;
						check=true;
						System.out.println(count);
					}
					}
					if(check==false) {
						System.out.println("Item not found");
					}
					System.out.println("Do you want to add more items?(Y or N)");
					 ch=sc.next();
				}while(ch=="Y");

			/*{
				do {

					for (int i = 0; i < 5; i++) {
						sc.nextLine();
						System.out.println("Enter Item Code");
						int icode = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Quantity");
						int iq = sc.nextInt();
						for (int j = 0; j < iarr.length; j++) {

							if (icode == (iarr[j].getItemCode())) {
								
								check=false;
								ca[i] = new Dstore(iarr[j].getItemname(), iarr[j].getPrice(),iq);
								break;
							}
				} if(check) {
					System.out.println("item found");
					break;
				}else {
					System.out.println("item NOT found");
				}
						System.out.println("Do you want to add more item?(Y or N)");
						ch = sc.next();
						if (ch.equalsIgnoreCase("N")) {
							break;
						}

					}
				} while (ch.equalsIgnoreCase("Y"));
			

			}*/
				sc.nextLine();
			for (int i = 0; i <count; i++) {
				if(ca[i] != null) {
				System.out.println(ca[i]);
			}
			}
			}
			break;
				
			case 3: {
				
				double TotalPrice = 0;
				
				for (int i=0;i<count-1;i++) {
					System.out.println(ca[i]);
					double priceItem = (ca[i].getPrice()) * (ca[i].getQuantity());
					TotalPrice = TotalPrice + priceItem;
				}
				System.out.println("Total Amount to be paid is " + TotalPrice);
			}
				break;
			default:
				System.out.println("wrong input");
			}
		}
	}
}
