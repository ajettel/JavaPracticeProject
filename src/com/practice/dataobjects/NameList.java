package com.practice.dataobjects;

import java.security.SecureRandom;
import java.util.ArrayList;

public class NameList {
	ArrayList<String> names;
	public NameList(){
		names = new ArrayList<String>();
		names.add("Alex");
		names.add("Berta");
		names.add("Chris");
		names.add("Derek");
		names.add("Eric");
		names.add("Felix");
		names.add("Gema");
		names.add("Hassan");
		names.add("Ilia");
		names.add("Janette");
		names.add("Karl");
		names.add("Lena");
		names.add("Maxi");
		names.add("Nora");
		names.add("Osama");
		names.add("Peter");
		names.add("Quincy");
		names.add("Rita");
		names.add("Sarah");
		names.add("Tom");
		names.add("Uwe");
		names.add("Verena");
		names.add("Werner");
		names.add("Xavier");
		names.add("Yvonne");
		names.add("Zerxes");	
		
		
	}
	public String getRandomFirstName(){
		SecureRandom numberGenerator = new SecureRandom();
		return names.get(numberGenerator.nextInt(names.size())); // No need to subtract one, it's from [0, size() )
	}
}
