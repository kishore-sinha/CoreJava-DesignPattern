package com.sinha.tutorial.strategyDP.CompressFileExample;

import java.util.ArrayList;

public class CompressionContext {

	CompressStrategy compressStrategy;
	
	public void setCompressionStrategy(CompressStrategy compressStrategy) {
		this.compressStrategy = compressStrategy;
	}
	
	public void compressFiles(ArrayList<String> files, String fileName) {
		compressStrategy.compressFiles(files, fileName);
	}
}
