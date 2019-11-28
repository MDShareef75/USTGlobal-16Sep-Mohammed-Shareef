package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {
	public static void main(String[] args) {
		try(FileReader in = new FileReader("csv.txt");
			BufferedReader reader = new BufferedReader(in);){
			
			while(reader.ready()) {
				//System.out.println(reader.readLine());
				String line = reader.readLine();
				String[] words = line.split(",");
				System.out.println("ID : "+words[0]);
				System.out.println("NAME : "+words[1]);
				System.out.println("SALARY : "+words[2]);
				System.out.println("GENDER : "+words[3]);
				System.out.println("*************************");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
