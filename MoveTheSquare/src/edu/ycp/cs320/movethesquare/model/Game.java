package edu.ycp.cs320.movethesquare.model;

public class Game {
	public static final double MOVE_DIST = 2.0; // x/y distance square moves each tick 
	private double width, height;
	private Circle circle;
	private double squareDx;
	private double squareDy;
	
	public Game() {
		
	}
	
	public void setSquare(Circle circle) {
		this.circle = circle;
	}
	
	public Circle getCircle() {
		return circle;
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
	
	public void setSquareDx(double squareDx) {
		this.squareDx = squareDx;
	}
	
	public double getSquareDx() {
		return squareDx;
	}
	
	public void setSquareDy(double squareDy) {
		this.squareDy = squareDy;
	}
	
	public double getSquareDy() {
		return squareDy;
	}

	

	}
