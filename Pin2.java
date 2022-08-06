package ks;

import java.util.Arrays;

public class Pin2 {
static int input1=0,input2=0,input3=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String p="";
		  int arr[]=new int [9];
		
       int temp1=input1,temp2=input2,temp3=input3;
       int n1=temp1%10;
       int n2=temp2%10;
       int n3=temp3%10;
		 arr[0]=n1;
		 arr[1]=n2;
		 arr[2]=n3;
		 
		 if(n1<n2&&n1<n3)
		 {
			 p+=Integer.toString(n1);
		 }
		 if(n2<n1&&n2<n3)
		 {
			 p+=Integer.toString(n2);
		 }
		 if(n3<n1&&n3<n2)
		 {
			 p+=Integer.toString(n3);
		 }

		 temp1=temp1/10;
		 int n4=temp1%10;
		 temp2=temp2/10;
		 int n5=temp2%10;
		 temp3=temp3/10;
		 int n6=temp3%10;
		 arr[3]=n4;
		 arr[4]=n5;
		 arr[5]=n6;
		 
		 if(n4<n5&&n4<n6)
		 {
			 p=Integer.toString(n4)+p;
		 }
		 if(n5<n4&&n5<n6)
		 {
			 p=Integer.toString(n5)+p;
		 }
		 if(n6<n4&&n6<n5)
		 {
			 p=Integer.toString(n6)+p;
		 }
		 
		
		 temp1=temp1/10;
		 int n7=temp1%10;
		 temp2=temp2/10;
		 int n8=temp2%10;
		 temp3=temp3/10;
		 int n9=temp3%10;
		 arr[6]=n7;
		 arr[7]=n8;
		 arr[8]=n9;
		 Arrays.sort(arr);
		 if(n7<=n8&&n7<=n9)
		 {
			 p=Integer.toString(n7)+p;
		 }
		 if(n8<=n7&&n8<=n9)
		 {
			 p=Integer.toString(n8)+p;
		 }
		 if(n9<=n7&&n9<=n8)
		 {
			 p=Integer.toString(n9)+p;
		 }
		 System.out.print(p);
		 p=arr[8]+p;
		int p1= Integer.parseInt(p);
	
//		return p1;
		System.out.println(p);
	}


	}


