
//サキボエムディナズムスナズムス
//学籍番号 ：２００４９５
//クラス：2C 
import java.io.*;
public class L6SampleP5{

    public static void main(String[] args) throws IOException {
        System.out.println("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        for (int i = 2; i <= num; i++) {
            if (i == num) {
                System.out.println(num + "は素数です。");
            } else if (num % i == 0) {
                System.out.println(num + " は変数ではありません。");
                break;
            }
        }

    }
}
