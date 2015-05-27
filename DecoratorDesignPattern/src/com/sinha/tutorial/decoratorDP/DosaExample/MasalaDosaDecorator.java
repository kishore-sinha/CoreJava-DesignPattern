package com.sinha.tutorial.decoratorDP.DosaExample;

public class MasalaDosaDecorator extends DosaDecorator {

	public MasalaDosaDecorator(Dosa dosa) {
		super(dosa);
	}

	@Override
	public String makeDosa() {
		return dosa.makeDosa() + ", added Masala using MasalaDosaDecorator";
		
	}

}
