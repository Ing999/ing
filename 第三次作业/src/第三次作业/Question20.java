package 第三次作业;
import java.util.Scanner;
public class Question20 {
	public static void main(String[] args) {
        String string;

        Scanner input = new Scanner(System.in);
        string = input.nextLine();

        if(string.length() == 0)
            System.exit(1);

        System.out.println("Its length is " + string.length());
        System.out.println("Its first character is " + string.charAt(0));

        input.close();
    }
}


