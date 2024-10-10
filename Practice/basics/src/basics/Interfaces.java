package basics;


interface Animal{
	void makeSonnd();
}


class dog implements Animal{

	@Override
	public void makeSonnd() {
		System.out.println("My sound is to barkk !!!");
		
	}
}

class cat implements Animal{

	@Override
	public void makeSonnd() {
		System.out.println("My sound is maauuwww !!");
		
	}
	
}


public class Interfaces {
		public static void main(String[] args) {
			dog d = new dog();
			cat c = new cat();
			d.makeSonnd();
			c.makeSonnd();
		}
}
