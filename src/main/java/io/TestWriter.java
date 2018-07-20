/**
 * 
 */
package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author q16926
 *
 */
public class TestWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String path = "d:\\test.txt";
		TestWriter testWriter = new TestWriter();
		testWriter.writeFileByFileWriter(path);
		testWriter.writeFileByBufferWriter(path);
	}

	// test Writer
	public void writeFileByFileWriter(String path) throws IOException {
		FileWriter fileWriter = new FileWriter(path);
		fileWriter.write("this add ::::: \r\n");
		fileWriter.flush();
		fileWriter.close();
	}

	// test BufferWriter
	public void writeFileByBufferWriter(String path) throws IOException {
		File file = new File(path);
		if (file.exists()) {
			FileWriter fileWriter =  new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("this bufferwriter::::\r\n");
			bufferedWriter.flush();
			fileWriter.close();
			bufferedWriter.close();
		}
	}
}
