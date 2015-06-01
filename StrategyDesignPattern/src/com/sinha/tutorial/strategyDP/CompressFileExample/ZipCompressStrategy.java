package com.sinha.tutorial.strategyDP.CompressFileExample;

import java.util.ArrayList;

public class ZipCompressStrategy implements CompressStrategy {

	public void compressFiles(ArrayList<String> files, String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Files are compressed using zip approach : '"+fileName+".zip' file is created");
	}
}
