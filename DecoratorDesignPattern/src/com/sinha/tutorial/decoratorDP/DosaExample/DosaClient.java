package com.sinha.tutorial.decoratorDP.DosaExample;

public class DosaClient {

	public static void main(String[] args) {

		PlainDosa plainDosa = new PlainDosa();
		System.out.println(plainDosa.makeDosa());
		
		MasalaDosaDecorator masalaDosa = new MasalaDosaDecorator(plainDosa);
		System.out.println("\n" + masalaDosa.makeDosa());
		
		OnionDosaDecorator onionDosa = new OnionDosaDecorator(plainDosa);
		System.out.println("\n" + onionDosa.makeDosa());
		
		PaneerDosaDecorator paneerDosa = new PaneerDosaDecorator(masalaDosa);
		System.out.println("\n" + paneerDosa.makeDosa());
	}

}