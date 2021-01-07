package 第二次作业;
import java.util.Scanner;
public class Triangle {
	public static void main(String args[])
	{ 
	 	    zhouchang();
	}
	    
			
  public static void zhouchang()
    {
	  Scanner scanner=new Scanner(System.in);
 	    while(scanner.hasNext())
 	    { 
 		  int a = scanner.nextInt();
 		  int b = scanner.nextInt();
 		  int c = scanner.nextInt();
		if(a+b<=c||a+c<=b||b+c<=a)
		{
			System.out.println("Input Error!");
		}
		else{
			double zc=a+b+c;
			  System.out.println(String.format("%.2f", zc));
		    }
	}
		}

}
