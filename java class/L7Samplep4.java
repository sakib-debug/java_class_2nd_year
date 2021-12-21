import java.io.*;


 public class L7Samplep4 {
    public static void main(String[] args) throws IOException
     {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

         int[] test =  new int[5];
         System.out.println(test.length + "5人の数を入力してください。");
        
         String str;
         for (int i=0; i<5; i++){
             str = br.readLine();
             int num = Integer.parseInt (str);
             test[i]=num;
          

                for (int j=0;j<test.length -1; j++){
               
                for (int k = j + 1; k< test.length;k++){
                   
                    if(test[j]<test[k]){
                        int temp= test[j];
                        test[j]=test[k];
                        test[k]= temp;

                        }
                    }
                }
             }


         }
         
        

    }
    

