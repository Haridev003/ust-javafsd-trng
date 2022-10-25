import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        int a=0;
        int b=0;
        String ans;

        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }
        for(int i=0; i<N; i++){
             b= data[i]%10;
             //a = (a*10)+b;
        }
        if(b % 10==0){
             ans = "Yes";
        }
        else{
         ans = "No";
        }
 
        
        
        System.out.println(ans);
        //return 0;
    }
}
