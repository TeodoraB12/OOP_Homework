package zadaca_1;

public class Student {
	public String firstName;	//deklaracija na atributi za klasata Student
	public String lastName;
	public int index;

	public Student() {		//default konstruktor
		
	}

	public Student(String firstName, String lastName, int index) {		//dinamicen konstruktor
		this.firstName = firstName;
		this.lastName = lastName;
		this.index = index;
		
	}}
