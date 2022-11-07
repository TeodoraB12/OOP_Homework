package zadaca_8;

public class Student extends Covek{
		public int[] grades;
		public float average;
		public int broj;

	public Student() {
	
	}
	public Student(int[] grades, float average,  int broj, String name, String surname, int index) {
		super(name, surname, index);
		this.grades = grades;
		this.average = average;
		this.broj = broj;
		
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	public float getAverage() {
		return average;
	}
	
	public String toString() {
		return "Student { " + "grade = " + "broj = "+ broj  + grades + ", average = " + average + super.toString()+ '}';
	}
	
	
}
