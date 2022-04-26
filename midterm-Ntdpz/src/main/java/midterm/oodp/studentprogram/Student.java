package midterm.oodp.studentprogram;

public class Student {
	private String name;
	private double score;
	private String major;
	private char grade;
	
	//TODO: complete this Constructor for initial value of name, score, and major
	
	
	
	public Student(String Name, double Score, String Major) {
		this.setName(Name);
		this.setScore(Score);
		this.setMajor(Major);
	}
	//TODO: implement this
	public  double getScore() {
		return score;
	}
	//TODO: implement this
	public void setScore(double Score) {
		this.score =  Score;
	}
	//TODO: implement this
	public String getName() {
		return name;
	}
	//TODO: implement this
	public void setName(String name) {
		this.name= name;
	}
	//TODO: implement this
	public String getMajor() {
		return major;
	}
	//TODO: implement this
	public void setMajor(String major) {
		this.major= major;
	}
	//TODO: implement this
	public char getGrade() {
		return grade;
	}
	//TODO: implement this
	public void setGrade(char grade) {
		this.grade= grade;
	}
	
	@Override
	public String toString() {
	//TODO: complete this method to print out student phone info.
	// [Peter] is in major [SE] has score= [85.55] and grade= [A]
		return this.name +" is in Major " +this.major +" has score=  "+this.score+" and grade=  "+this.grade;
	}
	
	
	

}
