import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n=sc.nextInt();
	    checkNumber(n);
   
	}
	
	public static void checkNumber(int n)
	{
		int rem,i=0, count=0;
		int m=n;
		int arr[]=new int[10];
		while(n>0)
		{
		  rem=n%10;
		  arr[i++]=rem;
		  n=n/10;
		}
		int j=0;
		{
			for(int k=j+1;k<arr.length;k++)
			{
				if(arr[j]>=arr[k])
				{
					count++;
				}
			}
		}
		if(count==(arr.length-1))
		{
			System.out.println(m+" is an increasing number");
		}
		else
			System.out.println(m+" is not an increasing number");
	}
	

}
