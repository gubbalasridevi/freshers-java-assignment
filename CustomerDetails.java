package cart;

import java.io.IOException;

public class CustomerDetails implements Runnable{
	private int custNum;
	public CustomerDetails(int custNum, String custName, String type) {
		super();
		this.custNum = custNum;
		this.custName = custName;
		this.type = type;
	}

	private String custName;
	private String type;
	
	public int getCustNum() {
		return custNum;
	}
	public void setCustNum(int custNum) {
		this.custNum = custNum;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	void display(){
		System.out.println("customer number  :"+custNum);
		System.out.println("cutomer name     :"+custName);
		System.out.println("Type of cutsomer :"+type);
	}

	public void run(){
		display();
		Products p;
		try {
			p=new Products();
			p.products();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
