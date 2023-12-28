package com.company.liskov_1;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		Square square = new Square(10);
		
		printArea(rectangle);
		printArea(square);
	}

	private static void printArea(Shape shape) {
		System.out.println("Area: " + shape.calculateArea());
	}
}
