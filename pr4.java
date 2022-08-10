package ks;

public class pr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="23*(56+187)+ab";
	    String arr[]=s1.split("[^0-9]");
	    int count=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(!(arr[i].isEmpty()))
	    	{
	    		count++;
	    	}
	    	
	    }
	    System.out.println("count-"+count);

	}

}
