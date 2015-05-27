package com.sinha.tutorial.decoratorDP.DosaExample;

public abstract class DosaDecorator implements Dosa{

	public Dosa dosa;

	public DosaDecorator(Dosa dosa) {
		super();
		this.dosa = dosa;
	}
	
	public void makeDosa(DosaDecorator dosaDecorator){
		this.dosa.makeDosa();
	}
}
