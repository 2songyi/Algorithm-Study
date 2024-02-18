import java.util.Scanner;

public class 숫자의합구하기 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        
        char[] cNum = sNum.toCharArray();
        
        int result = 0;
        
        // length 배열의 크기, length()는 문자열의 길이
        for (int i = 0; i < cNum.length; i++) {
            result += cNum[i] - '0';
        }
        
        System.out.print(result);
    }
}
