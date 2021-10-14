package lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Unit12_1_WriteDataUsingOutputStream {
	public static byte getInput()[] throws Exception
	{
		byte inp[ ]  = new byte[50];
		System.out.println("Enter some text : ");   
		for(int i=0; i<50; i++)
		{
			inp[i] = (byte)System.in.read();
		}
		return inp;
	}
	public static void main(String[] args) throws Exception{
		byte input[] = getInput();
		OutputStream f = new FileOutputStream("resources/sometext.txt");
		for(int i=0; i<50; i++) 
		{
			f.write(input [i]); 
		}
		f.close(); 
		int size;
		InputStream f1 = new FileInputStream ("resources/sometext.txt");   
		size = f1.available();
		System.out.println("Reading contents from the File : ");   
		for(int i=0; i<size; i++)  
		{
			System.out.print((char)f1.read());
		}
		f.close();
	}
}


