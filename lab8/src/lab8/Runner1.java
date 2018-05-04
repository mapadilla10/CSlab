package lab8;
/*Marko Padilla
 * CS lab 
 * Lab 8 - this lab implemented the use of bubble and selection sorting, then test to see which one is faster.
 * 4/4/2018
 */
public class Runner1 {

	public static Cube[] generatedCubes(int numCubes) {

		//init Array
		Cube[] cubesD = new Cube[numCubes];

		//setting cubes with random 100 l,w,h
		for (int i = 0; i < numCubes; i++) {  

			double length = (int)(Math.random()*100);

			double width = (int)(Math.random()*100);

			double height = (int)(Math.random()*100);

			cubesD[i] = new Cube(length, width, height);
			//if (height == 0){
		}

		return cubesD;  	 
	}

	//printing cubes
	public static void printCubes(Cube[] cubes){

		for(int i = 0; i < cubes.length; i++){

			System.out.println("Cube " + (i+1));

			System.out.println("Length = " + cubes[i].getLength() + ", Width = " + cubes[i].getWidth() + ", Height = " + cubes[i].getHeight());

			System.out.println("Volume = " + cubes[i].getVolume());

			System.out.println();
		}
	}

	//to copy identical cubes into another array
	public static Cube[] CopyArray(Cube[] cubes){
		Cube[] newArray = new Cube[cubes.length];

		for(int i = 0; i < cubes.length; i++){

			double length = cubes[i].getLength();
			double width = cubes[i].getWidth();
			double height = cubes[i].getHeight();

			newArray[i] = new Cube(length, width, height);
		}

		return newArray;
	}

	//start of bubble sort
	public static void BubbleSort(Cube[] cubes){
		int i,j;

		for(i = 0; i < cubes.length; i++){  
			for(j = 1; j < (cubes.length-i); j++){  

				if(cubes[j-1].getVolume() > cubes[j].getVolume()){  

					Cube temp = cubes[j-1];  
					cubes[j-1] = cubes[j];  
					cubes[j] = temp;  
				}        
			}  
		} 		
	}

	//start of selection sort
	public static void SelectionSort(Cube[] cubes){

		for (int i = 0; i < cubes.length - 1; i++)  //go one by one
		{  
			int index = i;  
			for (int j = i + 1; j < cubes.length; j++){  //finding the smallest
				if (cubes[j].getVolume() < cubes[index].getVolume()){  
					index = j;
				}  
			}  
			Cube minIndex = cubes[index];   
			cubes[index] = cubes[i];  
			cubes[i] = minIndex;  
		}   
	}



	//start of main method
	public static void main(String[] args) {
		int randomTwenty = 20;

		Cube cubesD[];

		cubesD = generatedCubes(randomTwenty);

		System.out.println();
		System.out.println("Unsorted / bubble sort:");
		printCubes(cubesD);

		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("After Bubble Sort implementation:");
		BubbleSort(cubesD);
		printCubes(cubesD);

		Cube newArray[];
		newArray = CopyArray(cubesD);

		System.out.println();
		System.out.println("Unsorted / selection sort:");
		printCubes(newArray);

		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("After Selection Sort implementation:");
		SelectionSort(newArray);
		printCubes(newArray);
	}

}