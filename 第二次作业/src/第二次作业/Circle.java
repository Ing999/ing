package �ڶ�����ҵ;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);        
        System.out.print("����һ�����λ��x,y: ");       
        int x =input.nextInt();        
        int y =input.nextInt();        
        int x0 = 0;        
        int y0 = 0;        
        double radius = 10;        
        double distance = Math.sqrt((x-x0)*(x-x0) + (y-y0)*(y-y0));        
        if (distance < radius)        
              System.out.print("�õ���Բ��");        
        else if (distance == radius)          
               System.out.print("�õ���Բ��");        
        else        
               System.out.print("�õ���Բ��");    
   }   
}

