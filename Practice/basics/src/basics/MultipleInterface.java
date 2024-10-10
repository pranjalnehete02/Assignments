package basics;

interface swim{
	public void swimming();
}

interface run{
	public void running();
}


class player implements swim, run{
	

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("Swimming");
		
	}

	@Override
	public void running() {
		// TODO Auto-generated method stub
		System.out.println("Running");
		
	}
	
	
}

public class MultipleInterface {
	public static void main(String[] args) {
		player p = new player();
		p.running();
		p.swimming();
	}
	
	}
	

