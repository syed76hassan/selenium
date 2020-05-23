package encapsulation;

import java.io.IOException;

import coll.map1;

public class calci {

	public calci()
	{
		try {
			Runtime.getRuntime().exec("calc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void add() {
		System.out.println("addinggg");
	}
	public static void main(String[] args) {
		calci c=new calci();
		c.add();
	}
}
