package org.test;

public class SeleniumBatch11AM {
	
	private void add(int a , int b) {
		
		a = 100;
		
		int c = a + b;
		
		System.out.println(c); // 30, 120 or exception
	}
	
	public static void main(String[] args) {
		SeleniumBatch11AM s = new SeleniumBatch11AM();
		s.add(10, 20);
		
	}
}
