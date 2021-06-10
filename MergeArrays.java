import java.util.*;

class MergeArrays
{
	public static int[] merge(int[] arr1, int[] arr2)
	{
		int i = 0, j = 0, k = 0;

		int n1 = arr1.length;
		int n2 = arr2.length;

		int[] arr3 = new int[n1+n2];

		while (i < n1 && j < n2)
		{
			if (arr1[i] < arr2[j])
			{
				arr3[k++] = arr1[i++];
			}
			else
			{
				arr3[k++] = arr2[j++];
			}
		}

		while (i < n1)
		{
			arr3[k++] = arr1[i++];
		}

		while (j < n2)
		{
			arr3[k++] = arr2[j++];
		}

		return arr3;
	}

	public static void main (String[] args)
	{
		int[] arr1 = {2, 3, 6, 7, 10, 14};

		int[] arr2 = {2, 4, 19, 24, 25};


		int [] arr = merge(arr1, arr2);

		int n = arr.length;

		for (int i=0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
