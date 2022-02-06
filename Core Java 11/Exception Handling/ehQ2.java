import java.util.Scanner;

public class ehQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend:");
		int dividend = sc.nextInt();
		
		System.out.println("Enter divisor:");
		int divisor = sc.nextInt();
		
		try
		{
			if(divisor==0)
			{
				throw new UnsupportedOperationException("Divisor can't be 0.");
			}
			System.out.println("quotient:"+(dividend/divisor));
		}
		catch (UnsupportedOperationException uoe)
		{
			System.out.println(uoe.getMessage());
		}
		finally
		{
			sc.close();
		}

	}

}
