import java.util.Scanner;

public class Excercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number you want to check");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		calc(n);
		
		

	}
	
	public static void calc(int n)
	{
		int i,count=0;
		for(i=1;i<n;i++)
		{
			if(Math.pow(2,i)==n)
			{
				count++;
		    }
	   }
		if(count>0)
		{
			System.out.println(n+" is a power of 2");
		}
		else
		{
			System.out.println(n+" is not a power of 2");
		}

    }
}
