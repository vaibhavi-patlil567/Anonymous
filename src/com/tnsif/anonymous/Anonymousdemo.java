package com.tnsif.anonymous;

public class Anonymousdemo {
	public void createClass() {
		Polygon p1 = new Polygon() {
			public void display() {
				System.out.println("Inside an anonymous class.");
			}
		};
		p1.display();
	}

}
