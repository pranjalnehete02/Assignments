package basics;

interface swimmer{
	public void Identity();
}

interface runner{
	public void Identity1();
}

class swimmerr implements swimmer{

	@Override
	public void Identity() {
		// TODO Auto-generated method stub
		System.out.println("Im swimemr");
		
	}
	
}

class runnerr implements runner{

	@Override
	public void Identity1() {
		// TODO Auto-generated method stub
		System.out.println("Im runner");
		
	}
	
}


public class Athelete {
	public static void main(String[] args) {
		swimmerr sw = new swimmerr();
		sw.Identity();
		
		runnerr ru = new runnerr();
		ru.Identity1();
	}
}
