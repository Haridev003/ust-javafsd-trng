
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);

int n=sc.nextInt();

while(n>0){

int Xcost=sc.nextInt(),Ycost=sc.nextInt(),Xcount=0,Ycount=0;sc.nextLine();

int partis=sc.nextInt();

for(int i=0;i<partis;i++){sc.nextLine();

Xcount+=sc.nextInt(); Ycount+=sc.nextInt();

 

}

int case1=(Xcount*Xcost)+(Ycount*Ycost), case2=(Xcount*Ycost)+(Ycount*Xcost);

 

System.out.println(case1<case2?case1:case2);

n--;

}

}
    
}
