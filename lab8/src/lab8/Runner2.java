package lab8;
/*Marko Padilla
 * CS lab 
 * Lab 8 - this lab implemented the use of bubble and selection sorting, then test to see which one is faster.
 * 4/4/2018
 */
public class Runner2 {

	public static void main(String[] args) {

		Cube cubesD[];
		Cube CopyArray[];

		long start;
		long end;

		//5000,6000,7000,8000,9000
		System.out.println("Test 5000 cubes: ");
		cubesD = Runner1.generatedCubes(5000);
		CopyArray = Runner1.CopyArray(cubesD);

		start = System.nanoTime();
		Runner1.BubbleSort(cubesD);
		end = System.nanoTime();
		System.out.println("Bubble Sort 5000 cubes: " + (end-start));

		start = System.nanoTime();
		Runner1.SelectionSort(CopyArray);
		end = System.nanoTime();
		System.out.println("Selection sort 5000 cubes: " + (end-start) );

		System.out.println();
		System.out.println("Test 6000 cubes: ");
		cubesD = Runner1.generatedCubes(6000);
		CopyArray = Runner1.CopyArray(cubesD);

		start = System.nanoTime();
		Runner1.BubbleSort(cubesD);
		end = System.nanoTime();
		System.out.println("Bubble Sort 6000 cubes: " + (end-start));

		start = System.nanoTime();
		Runner1.SelectionSort(CopyArray);
		end = System.nanoTime();
		System.out.println("Selection sort 6000 cubes: " + (end-start));

		System.out.println();
		System.out.println("Test 7000 cubes:");
		cubesD = Runner1.generatedCubes(7000);
		CopyArray = Runner1.CopyArray(cubesD);

		start = System.nanoTime();
		Runner1.BubbleSort(cubesD);
		end = System.nanoTime();
		System.out.println("Bubble sort 7000 cubes: " + (end-start));

		start = System.nanoTime();
		Runner1.SelectionSort(CopyArray);
		end = System.nanoTime();
		System.out.println("Selection sort 7000 cubes: " + (end-start));

		System.out.println();
		System.out.println("Test 8000 cubes:");
		cubesD = Runner1.generatedCubes(8000);
		CopyArray = Runner1.CopyArray(cubesD);

		start = System.nanoTime();
		Runner1.BubbleSort(cubesD);
		end = System.nanoTime();
		System.out.println("Bubble sort 8000 cubes: " + (end-start));

		start = System.nanoTime();
		Runner1.SelectionSort(CopyArray);
		end = System.nanoTime();
		System.out.println("Selection sort 8000 cubes: " + (end-start));

		System.out.println();
		System.out.println("Test 9000 cubes:");
		cubesD = Runner1.generatedCubes(9000);
		CopyArray = Runner1.CopyArray(cubesD);

		start = System.nanoTime();
		Runner1.BubbleSort(cubesD);
		end = System.nanoTime();
		System.out.println("Bubble 9000 cubes: " + (end-start));

		start = System.nanoTime();
		Runner1.SelectionSort(CopyArray);
		end = System.nanoTime();
		System.out.println("Selection sort 9000 cubes: " + (end-start));

	}

}