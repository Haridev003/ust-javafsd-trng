import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
 
        int zcount=0;
        int ycount=0;

        
        Scanner s = new Scanner(System.in);
        String ar = s.nextLine(); 
        for(int i=0;i<ar.length();i++){
           if (ar.charAt(i)=='z'){
             zcount++;
           }
            if (ar.charAt(i)=='o'){
             ycount++;
           }
           
        }
        if(ycount==(2*zcount)){
            System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }


    }
}
