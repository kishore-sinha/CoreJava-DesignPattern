package com.sinha.tutorial.strategyDP.CompressFileExample;

import java.util.ArrayList;

public class RarCompressStrategy implements CompressStrategy {

	public void compressFiles(ArrayList<String> files, String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Files are compressed using rar approach : '"+fileName+".rar' file is created");
	}
}
