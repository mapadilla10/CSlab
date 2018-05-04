package lab4;
/*Marko Padilla
 * CS lab 
 * Linked List Assignment
 * 2/27/2018
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnalyzePOI {

	private static POIList readFile(String fileName) throws IOException {
		POIList list = new POIList();
		int cur = 0;

		FileReader fr;
		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);

			String RILine;

			while((RILine = br.readLine()) != null) {
				long id;

				try {
					id = Long.parseLong(RILine);
				} catch (NumberFormatException e) {
					System.out.println("ID in file is not a long integer");
					br.close();
					return null;
				}

				String name = br.readLine();
				int threat;
				try {
					threat = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					System.out.println("Threat level is not an integer");
					br.close();
					return null;
				}

				if(threat < 0 || threat > 5) {
					System.out.println("Threat level is not in range 0-5");
					br.close();
					return null;
				}

				list.insertAt(cur++, id, name, threat);
			}

			fr.close();
			br.close();
			return list;
		} catch (FileNotFoundException e) {//file not found exception
			System.out.println("File not found: " + fileName);
			return null;
		} catch (IOException e) {//IO exception
			System.out.println("Error while reading: " + fileName);
			return null;
		}
	}

	//start of the main
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Please enter file name:");
			String inputFileName = br.readLine();
			POIList list = readFile(inputFileName);

			if(list == null) {//when reading the file
				while(true) {
					System.out.println("\nError occured while reading the file.");
					System.out.println("Please enter a file with required specifications.");

					System.out.print("\nPlease provide the filename of the input connection profile: ");
					inputFileName = br.readLine();
					list = readFile(inputFileName);

					if(list != null)
						break;
				}
			}

			System.out.println("\n File opened ");
			boolean open = true;

			while(open) {//when the file is opened
				System.out.println("\nPlease select one of the following choice:");
				System.out.println("1. Print the linked list content on the terminal");
				System.out.println("2. Search a person in the linked list with ID or name");
				System.out.println("3. Insert a new person in a particular location index");
				System.out.println("4. Swap two people in two specific location indices");
				System.out.println("5. Remove a record containing a specific ID");
				System.out.println("6. Remove all records with a certain threat level");
				System.out.println("7. Write the content of the linked list in an output file");
				System.out.println("8. Quit program.");

				System.out.print("\nSelected: ");
				String response = br.readLine();

				if(response.equals("1")) {
					list.printList();

				} else if(response.equals("2")) {
					System.out.print("\nEnter name: ");
					String personName = br.readLine();
					System.out.print("\nEnter the ID #: ");
					long id = Long.parseLong(br.readLine());

					POI result = list.searchPerson(personName, id);
					if(result == null) {
						System.out.println("\nName not found");
					} else {
						System.out.println("\nName found: \n" + result.toString());
					}

				} else if(response.equals("3")) {
					long id;
					int threatLevel;
					int index;
					String name;

					while(true) {
						System.out.print("\nEnter person ID #: ");
						try {
							id = Long.parseLong(br.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Incorrect ID(must be long integer). Try again");
							continue;
						}
						break;
					}

					System.out.print("Enter person name: ");
					name = br.readLine();

					while(true) {
						System.out.print("\nEnter the threat level of person: ");
						try {
							threatLevel = Integer.parseInt(br.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Threat level must be an integer between 0 and 5. Try again");
							continue;
						}
						if(threatLevel < 0 || threatLevel > 5) {
							System.out.println("Threat level must be an integer between 0 and 5. Try again");
							continue;
						}
						break;
					}

					while(true) {
						System.out.print("\nEnter the index at which to insert: ");
						try {
							index = Integer.parseInt(br.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Index must be an integer. Try again");
							continue;
						}
						break;
					}

					boolean result = list.insertAt(index, id, name, threatLevel);
					if(result) {
						System.out.println("\nSuccessfully inserted the information at given index.");
					} else {
						System.out.println("\nCould not insert the information at given index.");
					}

				} else if(response.equals("4")) {
					int idxA, idxB;

					while(true) {
						try {
							System.out.print("\nEnter first index: ");
							idxA = Integer.parseInt(br.readLine());
						} catch(NumberFormatException e) {
							System.out.println("This number must be an integer.Please re Enter Integer");
							continue;
						}
						break;
					}

					while(true) {
						try {
							System.out.print("\nEnter second index: ");
							idxB = Integer.parseInt(br.readLine());
						} catch(NumberFormatException e) {
							System.out.println("This number must be an integer.Please re enter Integer");
							continue;
						}
						break;
					}

					boolean result = list.swap(idxA, idxB);
					if(result) {
						System.out.println("\nPersons indices have been swapped.");
					} else {
						System.out.println("\nCould not swap indices.");
					}

				} else if(response.equals("5")) {
					long id;
					while(true) {
						System.out.print("\nEnter ID of the person: ");
						try {
							id = Long.parseLong(br.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Incorrect format for ID(must be long integer). Please re enter ID #");
							continue;
						}

						boolean result = list.removeID(id);
						if(result) {
							System.out.println("\nPerson with given ID has been removed from the list.");
						} else {
							System.out.println("\nCould not find ID #");
						}

						break;
					}

				} else if(response.equals("6")) {
					int threatLevel;
					while(true) {
						System.out.print("\nEnter threat level to be removed ");
						try {
							threatLevel = Integer.parseInt(br.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Threat level must be an integer between 0 and 5. Please re enter");
							continue;
						}

						if(threatLevel < 0 || threatLevel > 5) {
							System.out.println("Threat level must between 0 and 5. Please re enter");
							continue;
						}

						boolean result = list.removeThreat(threatLevel);
						if(result) {
							System.out.println("\nPerson with given threat level have been removed from the list.");
						} else {
							System.out.println("\nDid not find any person with the given threat level.");
						}

						break;
					}

				} else if(response.equals("7")) {
					System.out.print("Enter name of file to which it should be written ");
					String outputFileName = br.readLine();

					boolean result = list.writeToFile(outputFileName);

					if(result) {
						System.out.println("\nIt has been written to " + outputFileName);
					} else {
						System.out.println("\nCould not be written to " + outputFileName);
					}

				} else if(response.equals("8")) {
					open = false;
					continue;
				} else {
					System.out.println("\n Incorrect choice");
					System.out.println("You can only select from the following 1/2/3/4/5/6/7/8\n");
				}
			}
			System.out.println("\n Program Stopped.");
		} catch (IOException e) {
			System.out.println("Error in reading file. May not exist");
			return;
		}
	}
}
/*Operation 1. Print the linked list content on the terminal (ID, name, and threat
 *level of the people in a sequence they appear in the linked list)
 *Operation 2. Search a person in the linked list with ID
 *Operation 3. Insert a new person in a particular location index
 *Operation 4. Swap two people in two specific location indices
 *Operation 5. Remove a record containing a specific ID
 *389114
 *Dan Carte
 *5
 *399012
 *Prio Notim
 *0
 *685015
 *Hons Nohish
 *3
 *179318
 *Diran Egrac
 *2
 *284139
 *Osama Laden
 *5
 *Operation 6. Remove all records with a certain threat level
 *Operation 7. Write the content of the linked list in an output file that has the
 *same format as the input file.
 *Operation 8. Quit program.
 */