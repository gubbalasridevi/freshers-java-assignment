package cart;

import java.io.IOException;

public class Use implements Runnable{
	
	public static void main(String[] args)throws IOException{
		CustomerDetails c=new CustomerDetails(345,"xyz","heavy");
		Thread t1 =new Thread(c);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

		

}
