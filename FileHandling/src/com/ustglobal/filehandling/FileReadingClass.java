package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {

	public static void main(String[] args) {
		String path = "C:\\Users\\ATOM\\Downloads\\Desktop\\text.txt.txt";
		
		FileReader reader = null;
		
		try {
			reader = new FileReader(path);//it throws exception so we have to handle it using try-catch
			int i;
			while((i=reader.read())!=-1) {
				System.out.print((char)i);
			}
			
		
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}
}
