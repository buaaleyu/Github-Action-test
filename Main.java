import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x < 0 || (x % 10 == 0 && x != 0)){
            System.out.println(false);
        }
        String str = String.valueOf(x);
        int L = str.length() - 1;
        int R = 0;
        while (L > R) {
            if (str.charAt(L) != str.charAt(R)) {
                System.out.println(false);
            }
            else {
                System.out.println(true);
            }
            L--;
            R++;
        }

    }
}
