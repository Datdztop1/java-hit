import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str.toUpperCase());
            System.out.println("Chuỗi này là đối xứng.");
        } else {
            System.out.println(str.toLowerCase());
            System.out.println("Chuỗi này không đối xứng.");
        }
    }

    static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
