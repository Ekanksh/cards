import java.util.*;
import java.util.regex.*;

class vishal
{
	public static void main(String arg[])
	{
		
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();
			
			Pattern p=Pattern.compile("raone9561@");
			Matcher m=p.matcher(s1);
			
			if(m.find())
			{
				System.out.println("coorect password");
			}

			else
			{
				System.out.println("wrong password");
			}
			
	}
}
