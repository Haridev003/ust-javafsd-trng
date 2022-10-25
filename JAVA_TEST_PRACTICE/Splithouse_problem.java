
import java.util.*;



class TestClass {
    public static void main(String args[] ) throws Exception {
       
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String st = s.next();
        if(st.contains("HH"))
        {
            System.out.println("NO");

        }
        else{
            st=st.replace('.','B');
            System.out.println("YES");
            System.out.println(st);
        }
    }
}
