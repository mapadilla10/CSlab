/*Marko Padilla
 * CS lab 
 * implementation of stacks, from on postfix form equation from text file.
 * 4/024/2018
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Evaluator {

	public static void main(String[] args) throws IOException {
		//scan and read txt file
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter filename: ");
		String filename;

		filename = scn.nextLine();
		scn.close();
		//generic stack eqctn
		GenericStack eqc = new GenericStack();

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/" + filename));
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception.");
			e.printStackTrace();
		}

		String line = null;

		//Reading the file line by line
		//string to array
		while ((line = br.readLine()) != null) {

			eqc.popAll();

			int num = 0;

			String[] values = line.split(" "); 

			int x = 0;
			int y = 0;
			int r = 0;

			for(int i=0; i<values.length; i++){
				//check operand +-*... else follow stack
				if(values[i].equals("+")){

					//check size 
					if(eqc.Size() <= 1){

						//cannot be == 1
						num = 1;
						break;
					}	
					else{
						x = (int) eqc.pop();
						y = (int) eqc.pop();
						r = x+y;
						eqc.push(r);
					}
				}
				//repeat for other operands
				else if(values[i].equals("-")){

					if(eqc.Size() <= 1){

						num = 1;
						break;
					}
					else{
						x = (int) eqc.pop();
						y = (int) eqc.pop();
						r = y-x;
						eqc.push(r);
					}
				}

				else if(values[i].equals("*")){

					if(eqc.Size() <= 1){

						num = 1;
						break;
					}
					else{
						x = (int) eqc.pop();
						y = (int) eqc.pop();
						r = x*y;
						eqc.push(r);
					}
				}

				else if(values[i].equals("/")){

					if(eqc.Size() <= 1){

						num = 1;
						break;
					}
					else{
						x = (int) eqc.pop();
						y = (int) eqc.pop();
						r = y/x;
						eqc.push(r);
					}
				}

				else{
					eqc.push(Integer.parseInt(values[i]));//when next number is int then eqc push to stack
				}

			}

			if(num == 1){
				System.out.println(" cannot compute given equation");//cannot be == 1 
			}
			else{
				int answr = (int) eqc.pop();
				if(eqc.isEmpty())
					System.out.println(line + " = " + answr);//print answer
				else
					System.out.println(" cannot compute given equation");
			}

		}

	}
}