package zadaca_8;

public class Covek {
		public String name;
		public String surname;
		public int index;

	public Covek() {

	}
	
	public Covek(String name, String surname, int index) {
		this.name = name;
		this.surname = surname;
		this.index = index;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getIndex() {
		return index;
	}
	public String toString() {
			return "Covek {" + "name= " + name + ", surname = " + surname + ", index =  " + index + '}';
			
	}
}
