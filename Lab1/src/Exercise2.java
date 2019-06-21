import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int res = calculateSum(n);
		System.out.println("Difference is "+res);
		

	}
	public static int calculateSum(int n)
	{
		int sum1=0,sum2=0, p, diff;
		for(int i=1;i<=n;i++)
		{
			sum1+=Math.pow(i, 2);
		}
		for(int i=1;i<=n;i++)
		{
			sum2+=i;
		}
		p=(int) Math.pow(sum2, 2);
		diff= sum1-p;
		return diff;
	}

}
