package edu.ycp.cs320.movethesquare.model;

public class Circle {
	private double x, y, width, height, radius;
	
	public Circle() {
		radius = 10;
		
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
}
