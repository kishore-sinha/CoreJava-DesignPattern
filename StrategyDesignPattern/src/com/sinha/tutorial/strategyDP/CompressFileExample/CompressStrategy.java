package com.sinha.tutorial.strategyDP.CompressFileExample;

import java.util.ArrayList;

public interface CompressStrategy {

	public void compressFiles(ArrayList<String> files, String fileName);
}
