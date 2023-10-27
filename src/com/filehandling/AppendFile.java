package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
	public static void appendFile(String filePath, String content) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
			writer.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
