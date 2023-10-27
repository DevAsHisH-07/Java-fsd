package com.filehandling;

import java.io.IOException;

public class FileMain {

	public static void main(String[] args) throws IOException {

		String filePath="C:/Users/devas/Desktop/Testfile.txt/";
		WriteFile write =new WriteFile();
		write.writeInFile(filePath, "This is a Test File.");




		AppendFile app=new AppendFile();
		String text= "\nAppending File";
		app.appendFile(filePath, text);


		ReadFile read =new ReadFile();
		String content= read.readFile(filePath);
		System.out.println("Contents are: \n"+content);

	}

}
