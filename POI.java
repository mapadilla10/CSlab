package lab4;
/*Marko Padilla
 * CS lab 
 * Linked List Assignment
 * 2/27/2018
 */
public class POI {

	// Class instance variables
	private long id;
	private String name;
	private int threatLevel;

	public POI next;

	public POI() {//Initializes the POI object 
		this.id = 0;
		this.name = new String();
		this.threatLevel = -1;
		this.next = null;
	}

	public POI(long id, String name, int tlevel) {
		this.id = id;
		this.name = name; 
		this.threatLevel = tlevel;
		this.next = null;
	}

	// Getter, setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String toString() {
		return this.id + "\n" + this.name + "\n" + this.threatLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getThreatLevel() {
		return threatLevel;
	}

	public void setThreatLevel(int threatLevel) {
		this.threatLevel = threatLevel;
	}
}