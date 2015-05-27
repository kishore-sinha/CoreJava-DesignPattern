package com.sinha.kishore.factory;

import com.sinha.kishore.service.Shape;
import com.sinha.kishore.service.impl.CircleImpl;
import com.sinha.kishore.service.impl.RectangleImpl;
import com.sinha.kishore.service.impl.SquareImpl;

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
