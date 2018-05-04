public class Runner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cube cubes[];
		Cube cubes_copy[];
		long start, end;
		
		//Test on 2000 cubes.
		System.out.println("Test on 2000 cubes:");
		cubes = Runner1.makeCubes(2000);
		cubes_copy = Runner1.CopyArray(cubes);

		start = System.nanoTime();
	    	Runner1.BubbleSort(cubes);
	    end = System.nanoTime();
	    System.out.println("Time taken by Bubble Sort to sort 2000 cubes: " + ((end-start) / 1000000)+ "ms");
	    
	    start = System.nanoTime();
    		Runner1.SelectionSort(cubes_copy);
    	end = System.nanoTime();
    	System.out.println("Time taken by Selection Sort to sort 2000 cubes: " + ((end-start) / 1000000)+ "ms");
		
    	//Test on 3000 cubes.
    	System.out.println();
		System.out.println("Test on 3000 cubes:");
		cubes = Runner1.makeCubes(3000);
		cubes_copy = Runner1.CopyArray(cubes);

		start = System.nanoTime();
	    	Runner1.BubbleSort(cubes);
	    end = System.nanoTime();
	    System.out.println("Time taken by Bubble Sort to sort 3000 cubes: " + ((end-start) / 1000000)+ "ms");
	    
	    start = System.nanoTime();
    		Runner1.SelectionSort(cubes_copy);
    	end = System.nanoTime();
    	System.out.println("Time taken by Selection Sort to sort 3000 cubes: " + ((end-start) / 1000000)+ "ms");
    	
		//Test on 4000 cubes.
    	System.out.println();
		System.out.println("Test on 4000 cubes:");
		cubes = Runner1.makeCubes(4000);
		cubes_copy = Runner1.CopyArray(cubes);

		start = System.nanoTime();
	    	Runner1.BubbleSort(cubes);
	    end = System.nanoTime();
	    System.out.println("Time taken by Bubble Sort to sort 4000 cubes: " + ((end-start) / 1000000)+ "ms");
	    
	    start = System.nanoTime();
    		Runner1.SelectionSort(cubes_copy);
    	end = System.nanoTime();
    	System.out.println("Time taken by Selection Sort to sort 4000 cubes: " + ((end-start) / 1000000)+ "ms");
    	
		//Test on 5000 cubes.
    	System.out.println();
		System.out.println("Test on 5000 cubes:");
		cubes = Runner1.makeCubes(5000);
		cubes_copy = Runner1.CopyArray(cubes);

		start = System.nanoTime();
	    	Runner1.BubbleSort(cubes);
	    end = System.nanoTime();
	    System.out.println("Time taken by Bubble Sort to sort 5000 cubes: " + ((end-start) / 1000000)+ "ms");
	    
	    start = System.nanoTime();
    		Runner1.SelectionSort(cubes_copy);
    	end = System.nanoTime();
    	System.out.println("Time taken by Selection Sort to sort 5000 cubes: " + ((end-start) / 1000000)+ "ms");
    	
		//Test on 6000 cubes.
    	System.out.println();
		System.out.println("Test on 6000 cubes:");
		cubes = Runner1.makeCubes(6000);
		cubes_copy = Runner1.CopyArray(cubes);

		start = System.nanoTime();
	    	Runner1.BubbleSort(cubes);
	    end = System.nanoTime();
	    System.out.println("Time taken by Bubble Sort to sort 6000 cubes: " + ((end-start) / 1000000)+ "ms");
	    
	    start = System.nanoTime();
    		Runner1.SelectionSort(cubes_copy);
    	end = System.nanoTime();
    	System.out.println("Time taken by Selection Sort to sort 6000 cubes: " + ((end-start) / 1000000)+ "ms");
    	
		//Test on 7000 cubes.
    	System.out.println();
		System.out.println("Test on 7000 cubes:");
		cubes = Runner1.makeCubes(7000);
		cubes_copy = Runner1.CopyArray(cubes);

		start = System.nanoTime();
	    	Runner1.BubbleSort(cubes);
	    end = System.nanoTime();
	    System.out.println("Time taken by Bubble Sort to sort 7000 cubes: " + ((end-start) / 1000000)+ "ms");
	    
	    start = System.nanoTime();
    		Runner1.SelectionSort(cubes_copy);
    	end = System.nanoTime();
    	System.out.println("Time taken by Selection Sort to sort 7000 cubes: " + ((end-start) / 1000000) + "ms");
    	
    	
	}

}