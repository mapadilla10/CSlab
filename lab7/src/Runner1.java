package lab8;

import java.util.Scanner;

public class Runner1 {

	public static Cube[] makeCubes(int numOfCubes) {
         
		//declaration of a cube array
         Cube[] cubes = new Cube[numOfCubes];

	    //filling in the cubes
		 for (int i = 0; i < numOfCubes; i++) {  
			 
			 int length = (int)(Math.random()*100);
			 int width = (int)(Math.random()*100);
			 int height = (int)(Math.random()*100);
			 
			 cubes[i] = new Cube(length, width, height);
			  
		 }
		 
		 return cubes;  	 
    }
	
	//function to print the cubes
	public static void printCubes(Cube[] cubes){
		for(int i = 0; i < cubes.length; i++){
			System.out.println("Cube " + (i+1) + ": Length = " + cubes[i].getLength() + ", Width = " + cubes[i].getWidth() + ", Height = " + cubes[i].getHeight() + ", Volume = " + cubes[i].getVolume());
		}
	}
	
	//function to copy the cubes array to another array
	public static Cube[] CopyArray(Cube[] cubes){
		Cube[] cubes_copy = new Cube[cubes.length];
		
		for(int i = 0; i < cubes.length; i++){
			
			 double length = cubes[i].getLength();
			 double width = cubes[i].getWidth();
			 double height = cubes[i].getHeight();
			 
			 cubes_copy[i] = new Cube(length, width, height);
		}
		
		return cubes_copy;
	}
	
	//bubble sort
	public static void BubbleSort(Cube[] cubes){
		for(int i=0; i < cubes.length; i++){  
            for(int j=1; j < (cubes.length-i); j++){  
            	if(cubes[j-1].getVolume() > cubes[j].getVolume()){  
            		//swap elements  
                	Cube temp = cubes[j-1];  
                    cubes[j-1] = cubes[j];  
                    cubes[j] = temp;  
            	}        
            }  
		} 		
	}
	
	//selection sort
	public static void SelectionSort(Cube[] cubes){
		 for (int i = 0; i < cubes.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < cubes.length; j++){  
	                if (cubes[j].getVolume() < cubes[index].getVolume()){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            Cube smallerVolume = cubes[index];   
	            cubes[index] = cubes[i];  
	            cubes[i] = smallerVolume;  
	        }   
	}
	



	 public static void main(String[] args) {
		 
		 Scanner keyboard = new Scanner(System.in);
	     System.out.print("Enter the number of cubes: ");
	        
	     int numOfCubes;
	     numOfCubes = keyboard.nextInt();
	     
		 Cube cubes[];
		 cubes = makeCubes(numOfCubes);
		 
		 Cube cubes_copy[];
		 cubes_copy = CopyArray(cubes);
		 
		 System.out.println();
		 System.out.println("Array before Bubble Sort:");
		 printCubes(cubes);
		 
		 System.out.println();
		 System.out.println("Array after Bubble Sort:");
		 BubbleSort(cubes);
		 printCubes(cubes);
		 
		 System.out.println();
		 System.out.println("Copied array before Selection Sort:");
		 printCubes(cubes_copy);
		 
		 System.out.println();
		 System.out.println("Copied array after Selection Sort:");
		 SelectionSort(cubes_copy);
		 printCubes(cubes_copy);
		 keyboard.close();
		  
	 }

}