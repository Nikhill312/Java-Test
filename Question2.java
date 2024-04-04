class ArraySumCalculator
{
	
	public static int calculateMaxSum(int[] array1, int[] array2)
	{
		int sum = 0;
		int sumArray1 = 0, sumArray2 = 0;

		int m = array1.length, n = array2.length;

		int i = 0, j = 0;

		while (i < m && j < n)
		{

			while (i < m-1 && array1[i] == array1[i+1]) {
				sumArray1 += array1[i++];
			}

			while (j < n-1 && array2[j] == array2[j+1]) {
				sumArray2 += array2[j++];
			}


			if (array2[j] < array1[i])
			{
				sumArray2 += array2[j];
				j++;
			}

			else if (array1[i] < array2[j])
			{
				sumArray1 += array1[i];
				i++;
			}

			else	
			{
				
				sum += Integer.max(sumArray1, sumArray2) + array1[i];

				i++;
				j++;

				sumArray1 = 0;
				sumArray2 = 0;
			}
		}


		while (i < m) {
			sumArray1 += array1[i++];
		}

		while (j < n) {
			sumArray2 += array2[j++];
		}

		sum += Integer.max(sumArray1, sumArray2);
		return sum;
	}

	public static void main(String[] args)
	{
		int[] array1 = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
		int[] array2 = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };

		System.out.println("The maximum sum is " + calculateMaxSum(array1, array2));
	}
}
