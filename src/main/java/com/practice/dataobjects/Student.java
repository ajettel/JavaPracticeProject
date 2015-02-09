package com.practice.dataobjects;

public class Student {
	private String name;
	private int studentNumber;
	private double grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public void printStudent() {
		System.out.println("Name: " + this.name + " Student#: " + studentNumber + " Grade: " + grade);
	}
}
