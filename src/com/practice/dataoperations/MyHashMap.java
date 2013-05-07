package com.practice.dataoperations;

import java.util.HashMap;

import com.practice.dataobjects.NameList;
import com.practice.dataobjects.Student;

public class MyHashMap {
	HashMap<Integer,Student> hash;
	HashMap<String,Student> hashByName;
	NameList names;
	public MyHashMap(){
		hash = new HashMap<Integer,Student>();
		hashByName = new HashMap<String,Student>();
		names = new NameList();
	}

	public void addRandomStudents() {
		int ii;
		for(ii = 0; ii < 10000;ii++){
			Student tmpStudent = new Student();
			tmpStudent.setName(names.getRandomFirstName());
			tmpStudent.setStudentNumber(hash.size());
			
			Integer key = new Integer(tmpStudent.getStudentNumber());
			hash.put(key, tmpStudent);
		}
		
		System.out.println("Added " + hash.size() + " students to the Hashmap");
		
	}
	

	
}
