import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--)
            reversed += str.charAt(i);

        if (str.equalsIgnoreCase(reversed))
            System.out.println("Chuỗi là Palindrome");
        else
            System.out.println("Không phải Palindrome");

        System.out.println("Chuỗi đảo ngược: " + reversed);
    }
}
