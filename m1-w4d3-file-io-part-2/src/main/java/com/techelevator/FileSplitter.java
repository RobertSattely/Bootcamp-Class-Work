package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {

		int breakPoint = 100;
		
		File file = getFileFormUser();
		String fileName = getFileFormUser().getName();
		int dot = fileName.indexOf('.');
		try (Scanner source = new Scanner(file)){
					
			int program = 1;
			while(source.hasNext()){
				try (PrintWriter writer = new PrintWriter(fileName.substring(0, dot) + program + fileName.substring(dot))){ 
					for (int i = 1; i <= breakPoint; i++) {
						if(source.hasNext()){
							writer.println(source.nextLine());
						}else{
							break;
						}
					}	
					program++;
				}
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static File getFileFormUser() {
		System.out.println("Name the file you would like to split.");
		Scanner input = new Scanner(System.in);
		String path = input.nextLine();

		File checkFile = new File(path);
		if (!checkFile.exists()) {
			System.out.println("Looks like already exists");
			System.exit(1);
		}
		return checkFile;
	}

}
