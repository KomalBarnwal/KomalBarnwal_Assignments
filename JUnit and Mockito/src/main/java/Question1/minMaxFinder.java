package Question1;

import java.util.Arrays;

public class minMaxFinder {
	public int[] findMinMax(int[] arr)
	{
		int[] MinMax = new int[2];
		Arrays.sort(arr);
		MinMax[0] = arr[0];
		MinMax[1] = arr[(arr.length)-1];
		return MinMax;
	}
}