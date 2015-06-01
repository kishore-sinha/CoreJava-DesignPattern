package com.sinha.tutorial.strategyDP.CompressFileExample;

import java.util.ArrayList;

public class CompressClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("JavaDoc.txt");
		list.add("Release.txt");
		
		CompressionContext compressionContext = new CompressionContext();
		
		compressionContext.setCompressionStrategy(new ZipCompressStrategy());
		compressionContext.compressFiles(list, "JavaFiles");
		
		compressionContext.setCompressionStrategy(new RarCompressStrategy());
		compressionContext.compressFiles(list, "JavaFiles");
	}

}
