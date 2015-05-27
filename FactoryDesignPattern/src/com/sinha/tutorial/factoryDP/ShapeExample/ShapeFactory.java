package com.sinha.tutorial.factoryDP.ShapeExample;


public class ShapeFactory {

	public Shape getShape(String shapeType) {
		
		if(shapeType==null)
			return null;
		else if(shapeType.equalsIgnoreCase("Circle"))
			return new CircleImpl();
		else if(shapeType.equalsIgnoreCase("Square"))
			return new SquareImpl();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new RectangleImpl();
		
		return null;
	}
}
