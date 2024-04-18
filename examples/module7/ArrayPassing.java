

/**
 * An example of passing an one-dimensional array as a parameter.
 * @author amit
 */
public class ArrayPassing
{

	/**
	 * Double each element of the passed array.
	 * WARNING: The contents of the given array will be changes.
	 * @param a
	 */
	private static void changeArray(int[] a)
	{
		for (int i = 0; i < a.length; i++)
			a[i] = 2*a[i];
	}

	/**
	 * @param args Not used
	 */
	public static void main(String[] args)
	{
		int[] array = new int[5];

		for (int i = 0; i<array.length; i++)
			array[i] = i+1;

		for (int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();

		changeArray(array);

		for (int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
