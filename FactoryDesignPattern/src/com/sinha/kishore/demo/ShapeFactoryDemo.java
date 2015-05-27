package com.sinha.kishore.demo;

import com.sinha.kishore.factory.ShapeFactory;
import com.sinha.kishore.service.Shape;

public class ShapeFactoryDemo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Square");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("Rectangle");
		shape3.draw();
	}

}
