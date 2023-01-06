import java.util.Scanner;
public class prime1
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n\t\"CHECK PRIME NUMBER\"");
		Scanner input =new Scanner (System.in);
		int m,n, count = 0,totalPrime = 0;

		System.out.print("\n\nEnter Starting number : ");
		m = input.nextInt();


        System.out.print("\n\nEnter Ending number : ");
		n = input.nextInt();
		
        for(int i = m; i<=n ; i++)
        {
        	for(int j = 2; j<i; j++)
		    {
			  if(i % j ==0)
			    {
				  count++;
				  break;
			    }
		    }
            
		    if(count == 0)
		    
			     {

			     	System.out.println(i);
			     	totalPrime ++;
		    
			     }
			     count = 0;
			     
		    


        }
        System.out.print("Total Prime Number : "+totalPrime);


	}
}