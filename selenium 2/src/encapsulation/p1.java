package encapsulation;


public class p1 {

      private int i;
      public p1(int i) {
    	  this.i=i;
      }
	public void add(int j) {
		i=i+j;
	}
	public void print()
	{
		System.out.println(i);
	}
	}
class p2{
	public static void main(String[] args) {
		p1 p=new p1(3);
		p.add(2);
		p.print();
	}
	
}


