import java.util.Scanner;

public class CalcSum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the value of n");
		 int n=sc.nextInt();
		 int res= calculateSum(n);
		 System.out.println(res);
		
		
		

	}
	 
	public static int calculateSum(int n)
	{
		int i=1,sum=0,flag=1;
		for(i=1; ;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum+=i;
				flag++;
			}
			if(flag>n)
				break;
		}
			
		return sum;
	}

}
