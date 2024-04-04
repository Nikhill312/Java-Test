import java.util.Arrays;

class MergeArrays
{
	
	private static void merge(int[] arr1, int[] arr2, int m, int n)
	{
		
		int k = m + n + 1;
		while (m >= 0 && n >= 0)
		{
			if (arr1[m] > arr2[n]) {
				arr1[k--] = arr1[m--];
			}
			else {
				arr1[k--] = arr2[n--];
			}
		}

		
		while (n >= 0) {
			arr1[k--] = arr2[n--];
		}

		Arrays.fill(arr2, 0);
	}


	public static void rearrange(int[] arr1, int[] arr2)
	{

		if (arr1.length == 0) {
			return;
		}

		int k = 0;
		for (int value: arr1)
		{
			if (value != 0) {
				arr1[k++] = value;
			}
		}

		merge(arr1, arr2, k - 1, arr2.length - 1);
	}

	public static void main (String[] args)
	{

		int[] arr1 = { 0, 2, 0, 3, 0, 5, 6, 0, 0};
		int[] arr2 = { 1, 8, 9, 10, 15 };


		rearrange(arr1, arr2);

		System.out.println(Arrays.toString(arr1));
	}
}
