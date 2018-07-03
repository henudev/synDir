/**
 * 
 */
package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author q16926
 *
 */
public class TestReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "d:\\test.txt";
		TestReader testReader = new TestReader();
		testReader.readFileByFileReader(path);

	}
	
	//test reader.
	public void readFileByFileReader(String path) throws IOException {
		FileReader fileReader = new FileReader(path);
		char[] buf = new char[10];	//everytime read 1024 chars
		int tmp = 0;
		System.err.println("readFileByReader out ::::");
		while ((tmp = fileReader.read(buf)) != -1) {
			System.err.println("tmp is :::::" + tmp);
			System.err.print(new String(buf, 0, tmp));
		}
		System.err.println();
		fileReader.close();
	}
}
