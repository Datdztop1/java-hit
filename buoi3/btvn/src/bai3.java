import java.util.Random;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        runQuiz(sc);
    }

    static void runQuiz(Scanner sc) {
        Random rand = new Random();
        int a = rand.nextInt(101);
        int b = rand.nextInt(101);
        boolean isRight = rand.nextBoolean();
        int c = isRight ? a + b : rand.nextInt(201);

        System.out.println("Phép toán: " + a + " + " + b + " = " + c);
        System.out.print("Phép tính ĐÚNG hay SAI? ");
        String ans = sc.nextLine().toLowerCase();

        if ((isRight && ans.equals("đúng")) || (!isRight && ans.equals("sai")))
            System.out.println("Bạn đã trả lời đúng!");
        else
            System.out.println("Bạn đã trả lời sai!");
    }
}
