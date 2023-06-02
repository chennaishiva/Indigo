package org.test;

public class SampleTextAndContains {
	
	private void add(int...a) {

		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		SampleTextAndContains s = new SampleTextAndContains();
		s.add(10,20,30, 32, 54, 45,67);
		
	}
	
	
}
