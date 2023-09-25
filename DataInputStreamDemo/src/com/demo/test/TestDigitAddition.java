package com.demo.test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestDigitAddition {
	public static void main(String[] args) {
		try(DataInputStream dis=new DataInputStream(new FileInputStream("numbers.dat"));) {
			String str=dis.readLine();
			int sum=0;
			while(str!=null) {
				int x=Integer.parseInt(str);
				sum=sum+x;
				str=dis.readLine();
			}
			System.out.println("addition : "+sum);
		
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
