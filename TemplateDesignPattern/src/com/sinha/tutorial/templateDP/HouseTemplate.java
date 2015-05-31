package com.sinha.tutorial.templateDP;

public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		buildRoof();
		System.out.println("House is Built");
	}
	
	abstract void buildFoundation();
	abstract void buildPillars();
	abstract void buildWalls();
	abstract void buildWindows();
	abstract void buildRoof();
}
