package basics;

@FunctionalInterface
interface lam{
	 void add();
}

public class lambda {
	public static void main(String[] args) {
//		lam l = new lam() {
//			public void add() {
//				System.out.println("Hii");
//			}
			
			lam l = ()-> System.out.println("Hii");
			l.add();
		};
		
		
	}
	

