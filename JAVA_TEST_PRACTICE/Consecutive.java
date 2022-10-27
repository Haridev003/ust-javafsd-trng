import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class A{
public static void main(String args[]){
    int f=0;
   int Arr[]={12,13,14};
   for(int i=1;i<Arr.length;i++){
       f=0;
       if((Arr[i]-Arr[i-1])==1)
       {
           f=1;
       }
       else{
           break;
       }
   }
   if(f==1){
       System.out.println("Consecutive");
   }
   else{
        System.out.println("Not Consecutive");
   }
   
}
}
