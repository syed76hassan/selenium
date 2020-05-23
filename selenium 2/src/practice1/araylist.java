package practice1;

import java.util.ArrayList;
import java.util.List;

public class araylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> l=new ArrayList<String>();
	System.out.println(l.size());
	l.add("bangalore");
	l.add("mandaya");
	l.add("mysore");
	l.add("bangalore");
	System.out.println(l.size());
	System.out.println(l.get(1));
	for(int i=0;i<l.size();i++) {
		String s = l.get(i);
		System.out.println(s);
	}
	}

}
