
import java.util.*;



class TestClass {
    public static void main(String args[] ) throws Exception {
       
      Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int f=1;
        if(n==0){
            f=0;
        }
        else{
        for(int i=n;i>0;i--)
        {
            f=f*i;
        }
        }
        System.out.println(f);
    }
}
