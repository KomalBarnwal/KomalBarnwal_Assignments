import java.util.ArrayList;
import java.util.List;
class armstrongBetweenRange{
	public int[] armstrongInRange(int min, int max) {
		int sum,n,i,arm,r;
		List<Integer> in = new ArrayList<>();   //list is used to add matched elements
		for(i=min;i<=max;i++) {
			n=i;
			arm = n;sum=0;
			while(n!=0) {
				r = n%10;
				n = n/10;
				sum = sum + r*r*r;
			}
			if(sum==arm) {
				in.add(sum);
		}
	}
		System.out.println(in);   //printing list
		return new int[0];
	}	
}
public class assignment1Q2 {
	public static void main(String[] args) {
		int min = 100; int max = 999;
		armstrongBetweenRange arm = new armstrongBetweenRange();
        arm.armstrongInRange(min, max);
	}

}