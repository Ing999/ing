package �������ҵ;
import java.util.Random;
public class Question4 {
	public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0, n = 0; i < 50; i++, n++) {
            if(n % 10 == 0)
                System.out.println("");
            System.out.print(random.nextInt(100) + " ");
		}
	}

}
