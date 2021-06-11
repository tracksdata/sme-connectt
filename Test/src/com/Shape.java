package com;

public class Shape {
	
	
	public void draw() {
		
	}

}

class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
	
	public void draw(int x) {
		System.out.println("Drawing a square");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}
