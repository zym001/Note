package com.test2;

public class Teset1 {
	private String name;
	
	public Teset1() {
		// TODO Auto-generated constructor stub
	}
	
	public Teset1(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		Teset1 teset1 = new Teset1("zym");
		System.out.println(teset1.name);
		
		int t = 0;
		int []a = {1,22,12,31,98,6,89};
		for (int i = 0; i < a.length; i++) {
			for (int j=0; j < a.length - 1; j++) {
				if (a[j] > a[j+1]) {
					t=a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
			
		}
		for (int i : a) {
			System.out.print(i+"  ");
		}
		
	}

}
