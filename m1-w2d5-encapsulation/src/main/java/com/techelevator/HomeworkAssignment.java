package com.techelevator;

public class HomeworkAssignment {
	
	private int totalMarks;      
	private int possibleMarks;   
	private String submitterName; 
	private String letterGrade;  
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public String LetterGrade() {
		return letterGrade;
	}
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
	
	public String getLetterGrade (){
		double gradePercent = (totalMarks/(double)possibleMarks) * 100;
		
		if (gradePercent >= 90){
			return "A";
		}else if (gradePercent >=80){
			return "B";
		}else if (gradePercent >=70){
			return "C";
		}else if (gradePercent >=60){
			return "D";
		}else {
			return "F";
		}
	}
	public HomeworkAssignment(int possibleMarks){
		this.possibleMarks = possibleMarks;
	}
	
}
