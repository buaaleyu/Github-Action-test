
import java.util.Scanner;

public class Main {
    public boolean isPalindrome(int x) {
        Scanner scanner = new Scanner(System.in);
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        String str = String.valueOf(x);
        int L = str.length() - 1;
        int R = 0;
        while (L > R) {
            if (str.charAt(L) != str.charAt(R))
                return false;
            L--;
            R++;
        }
        return true;
    }
}
