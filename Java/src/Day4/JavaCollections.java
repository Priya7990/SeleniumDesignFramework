package Day4;

import java.util.ArrayList;
import java.util.List;

public class JavaCollections {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		mylist.add(23);
		mylist.add("wellcome");
		mylist.add('l');
		mylist.add(null);
		System.out.println("This is list: " +mylist.size());
		System.out.println("values: " +mylist);
		
		for(int i=0;i<mylist.size();i++)
		{
			
			System.out.println("this is current list: " +mylist.get(i));
		}

	}

}
