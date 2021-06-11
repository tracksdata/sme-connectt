package com;

public class Use {
	
	public static void main(String[] args) {
		
		
		Shape s=new Square();
		//s.draw();
		s=new Circle();
		//s.draw();
		
		
		Calculate c=new Calculate();
		System.out.println(c.sum(100,200));
		System.out.println(c.sum(100,200,3000));

		
	}

}
