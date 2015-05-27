package com.sinha.tutorial.designPattern.decorator.DosaExample;

public class PaneerDosaDecorator extends DosaDecorator {

	public PaneerDosaDecorator(Dosa dosa) {
		super(dosa);
	}

	@Override
	public String makeDosa() {
		return dosa.makeDosa() + ", added Paneer using PaneerDosaDecorator";
	}

}
