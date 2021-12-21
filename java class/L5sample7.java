//サキボエムディナズムスナズムス
//学籍番号 ：２００４９５
//クラス：：2C
import java.io.*;
public class L5sample7 {
    public static void main(String[] args) throws IOException
{
    System.out.println("あなたは男性ですか？");
    System.out.println("あなたは女性ですか？");
    BufferedReader br = 
    new BufferedReader(new InputStreamReader(System.in));
    String str =br.readLine();
   
    char res = str.charAt(0);
    
    if(res== 'Y' ||res== 'Y'){
       
        System.out.println("あなたは男性ですね。");
    }

       else if(res== 'N' ||res== 'N'){
        System.out.println("あなたは女性ですね。");
       }
        else{
        System.out.println("YまたはNを入力してください。");
   
    }




    }
    
}
