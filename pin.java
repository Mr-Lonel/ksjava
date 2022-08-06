package ks;

import java.util.Scanner;

public class pin {
	public static int fastchar(int roomNo)
	{
		
		int temp3=roomNo;
		int sum=0;
		int n1=0;
		int temp4=roomNo;
		while(temp3>0)
		{
			n1=temp3%10;
			sum+=n1;
			temp3=temp3/10;
		}
		return sum;
	}
	
	public static void createWifiPin(int roomNo, String lastName)
	{
		String p="";
		int temp=roomNo;
		int temp2=temp%10;
		temp=temp/10;
		p+=temp%10;
		int l;
		l=lastName.length();
		p=lastName.charAt(l-1)+p;
		if(temp2==1)
		{
			p='!'+p;
		}
		if(temp2==2)
		{
			p='@'+p;
		}
		if(temp2==3)
		{
			p='#'+p;
		}
		if(temp2==4)
		{
			p='$'+p;
		}
		if(temp2==5)
		{
			p='%'+p;
		}
		if(temp2==6)
		{
			p='^'+p;
		}
		if(temp2==7)
		{
			p='&'+p;
		}
		if(temp2==8)
		{
			p='*'+p;
		}
		if(temp2==9)
		{
			p='('+p;
		}
		if(temp2==0)
		{
			p=')'+p;
		}
		int temp4=roomNo;
		while(temp4>9)
		{
			temp4=fastchar(temp4);
			
		}
		if(temp4==1)
		{
			p='2'+p;
		}
		else
		{
		if(temp4%2==0)
		{
			p=temp4+p;
		}
		else
		{
			temp4-=1;
			p=temp4+p;
		}
		}
		
		System.out.println(p);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name:");
		String n=scan.next();
		System.out.println("enter the room no:");
		int rm=scan.nextInt();
		createWifiPin(rm,n);
		

	}

}
