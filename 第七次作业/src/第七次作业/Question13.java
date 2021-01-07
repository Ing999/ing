package 第七次作业;
import java.util.ArrayList;
import java.util.Scanner;
public class Question13 {
	public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers end with 0: ");
        int number = input.nextInt();
        while (number != 0){
            num.add(number);
            number = input.nextInt();
        }
        int res = max(num);
        System.out.println("The max number is " + res);
    }
    public static Integer max(ArrayList<Integer> list){
        if (list.size() == 0 || list == null)
            return 0;
        int ret = list.get(0);
        for (int i = 1;i < list.size();++i)
            if (list.get(i) > ret)
                ret = list.get(i);
        return ret;
    }
}
