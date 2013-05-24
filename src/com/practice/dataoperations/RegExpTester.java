package com.practice.dataoperations;

public class RegExpTester {

	public void start(){
		String url = "http://localhost:9090/find?term=cooking&term=healthy&count=2"; 
		String[] urlSplit = url.split("(term=)"); 
		
		int counter = 1;
		for(String tmp : urlSplit){
			String [] params = tmp.split("&");
			for(String word : params){
				System.out.println(counter + ". " + word);	
			}
			
			counter++;
		}
	}
}
