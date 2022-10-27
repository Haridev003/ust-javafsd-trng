import java.util.*;
import java.util.Scanner;
import java.lang.*;
class HelloWorld {
    public static void main(String[] args) {
       double p,r,n,t,a,s,m;
       System.out.println("Enter rate: ");
       Scanner sc=new Scanner(System.in);
       r=sc.nextDouble();
       System.out.println("Enter time: ");
       n=sc.nextDouble();
       System.out.println("Enter no. of times: ");
       t=sc.nextDouble();
       System.out.println("Principal amount: ");
       p=sc.nextDouble();
       s=n*t;
       m=1+(r/n);
       a=p*Math.pow(m,s);
       System.out.println("Compound interest is: "+a);
    }
}
