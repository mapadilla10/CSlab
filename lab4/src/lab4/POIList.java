package lab4;
/*Marko Padilla
 * CS lab 
 * Linked List Assignment
 * 2/27/2018
 */

import java.io.IOException;
import java.io.FileWriter;

public class POIList {

	private POI head;
	int length;

	public POIList() {
		this.head = null;
		this.length = 0;
	}

	public void printList() {
		if(this.length == 0) {
			System.out.println("\nThe list is empty.");
			return;//print person in list
		}
		POI cur = this.head;

		while(cur != null) {
			System.out.println(cur.toString());
			cur = cur.next;
		}
	}

	public boolean insertAt(int index, long id, String name, int tl) {//insert to POI link at index
		if(index < 0 || index > this.length)
			return false;//boolean to check insertion
		else {
			if(index == 0) {
				POI newPoi = new POI(id, name, tl);

				newPoi.next = this.head;
				this.head = newPoi;
				this.length++;

			} else if(index == this.length) {
				POI cur = this.head;

				while(cur.next != null) {
					cur = cur.next;
				}

				POI newPOI = new POI(id, name, tl);
				cur.next = newPOI;
				this.length++;
			} else {

				int idx = 0;
				POI cur = this.head;
				while(idx != index-1) {
					cur = cur.next;
					idx++;
				}

				POI newPOI = new POI(id, name, tl);
				POI nextPOI = cur.next;
				cur.next = newPOI;
				newPOI.next = nextPOI;
				this.length++;
			}
			return true;
		}
	}

	public POI searchPerson(String name, long id) {//to search name and ID
		POI result = null;
		POI cur = this.head;

		while(cur != null) {
			if(cur.getId() == id || name.equals(cur.getName())) {
				result = cur;
				break;
			}
			cur = cur.next;
		}

		return result;//return match
	}

	public boolean removeID(long id) {//to remove name with ID #, iterating until required id is found
		boolean flag = false;
		POI prev = null, cur = this.head;

		while(cur != null) {
			if(cur.getId() == id) {
				break;
			} else {
				prev = cur;
				cur = cur.next;
			}
		}

		if(cur != null) {

			flag = true;

			if(prev != null) {
				POI next = cur.next;
				cur = null;
				prev.next = next;
			} else {
				this.head = this.head.next;
				cur = null;
			}
		}
		return flag;
	}

	public boolean removeThreat(int level) {//to remove from POI list
		boolean check = false;
		POI prev = null;
		POI	cur = this.head;

		while(cur != null) {
			if(cur.getThreatLevel() == level) {
				check = true;

				if(prev != null) {
					POI temp = cur.next;
					cur = null;
					prev.next = temp;
					cur = temp;
				} else {
					POI temp = cur.next;
					cur = null;
					this.head = temp;
					cur = this.head;
					prev = null;
				}
			} else {
				prev = cur;
				cur = cur.next;
			}
		}
		return check;
	}

	public boolean swap(int index1, int index2) {//swap from indexes returning true or false
		if(index1 < 0 || index1 >= this.length)
			return false;

		if(index2 < 0 || index2 >= this.length)
			return false;

		POI prev1 = null, curr1 = this.head;
		
		int idx1 = 0;

		while(idx1 != index1) {
			prev1 = curr1;
			curr1 = curr1.next;
			idx1++;
		}

		POI prev2 = null;
		POI cur2 = this.head;

		int idx2 = 0;

		while(idx2 != index2) {
			prev2 = cur2;
			cur2 = cur2.next;
			idx2++;
		}
		if (prev1 != null)
			prev1.next = cur2;
		else 
			this.head = cur2;

		if (prev2 != null)
			prev2.next = curr1;
		else 
			this.head = curr1;
		POI temp = curr1.next;
		curr1.next = cur2.next;
		cur2.next = temp;

		return true;
	}

	public boolean writeToFile(String fileName) {//to write POIList to file 
		try {
			FileWriter fw = new FileWriter(fileName);

			POI cur = this.head;

			while(cur != null) {
				fw.write(Long.toString(cur.getId()) + "\n");
				fw.write(cur.getName() + "\n");
				fw.write(cur.getThreatLevel() + "\n");

				cur = cur.next;
			}

			fw.close();
		} catch (IOException e) {
			System.out.println("Error occured while file writing");
			return false;
		}

		return true;
	}
}