package Day1;
import java.io.*;
public class reversestring 
{
	public static void main(String[] args) 
	{		
	String orginalstr ="Hello I am Priya";
	String reversedstr=" ";
	for(int i=0;i<orginalstr.length();i++) 
	{
		reversedstr=orginalstr.charAt(i)+reversedstr;		
	}
	System.out.println("reversedstr is :" +reversedstr);
	}
 	}
	
	




