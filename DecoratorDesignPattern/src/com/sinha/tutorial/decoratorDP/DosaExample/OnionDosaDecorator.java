package com.sinha.tutorial.decoratorDP.DosaExample;

public class OnionDosaDecorator extends DosaDecorator {

	public OnionDosaDecorator(Dosa dosa) {
		super(dosa);
	}

	@Override
	public String makeDosa() {
		return dosa.makeDosa() + ", added Onion using OnionDosaDecorator";
	}

}
