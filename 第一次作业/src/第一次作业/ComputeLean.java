package ��һ����ҵ;
import java.util.Scanner;
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
public class ComputeLean {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter annual interest rate, e.g., 7.25%:");
		double annualInterestRate=input.nextDouble();
		double monthlylnterestRate=annualInterestRate / 1200;
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextlntO ;
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDoubleO;
		double monthlyPayment = loanAmount * monthlylnterestRate /(11 / Math.pow(1 + monthlylnterestRate, numberOfYears * 12));
	    double totalPayment = monthlyPayment * numberOfYears * 12;
	    System.out.println("The monthly payment is S" + (int)(monthlyPayment * 100)/ 100.0);
				
	}

}
