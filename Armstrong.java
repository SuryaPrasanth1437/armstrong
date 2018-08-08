package program;

import java.util.Scanner;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		int n,t,sum=0,r;
		Scanner nu= new Scanner(System.in);
		System.out.println("enter the number");
		n=nu.nextInt();
		t=n;
		if (n>=100 && n<=999)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			System.out.println(n+""+sum);
			if (n>=10 && n<=99)
				{
					r=n%10;
					sum=sum+(r*r*r);
					n=n/10;
					System.out.println(n+""+sum);
					if(n>=1&&n<=9)
					{
						r=n%10;
						sum=sum+(r*r*r);
						n=n/10;
						System.out.println(n+""+sum);
				
					}
				}
		}
		else
			System.out.println("invalid number");
			System.exit(0);
		if (t==sum)
			System.out.println("the given number is armstrong");
		else
			System.out.println("not armstrong");
		nu.close();
	}
	

}
