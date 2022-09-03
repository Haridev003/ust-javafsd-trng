package com.ust;
import java.util.Arrays;

public class Concat {
	public static void main(String args[])
	{
		int array1[]= {1,2,3};
		int array2[]= {4,5,6};
		int aLen=array1.length;
		int blen=array2.length;
		int result[]= new int[aLen+blen];
		System.arraycopy(array1, 0, result,0, aLen );
		System.arraycopy(array2, 0, result, aLen, blen);
		System.out.println(Arrays.toString(result));
		
		
		
		
		}
}
