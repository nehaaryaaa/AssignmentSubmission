package lab;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;

public class Unit12_2UppercaseChars {

	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream b = new ByteArrayOutputStream(12);
		System.out.println("Enter characters to convert them to uppercase : ");
		while(b.size() != 10)
		{
			b.write(System.in.read());
		}
		System.out.println("Stored characters into Array");
		byte b1[]=b.toByteArray();
		System.out.println("Characters in the Array : ");
		for(int i=0;i<b1.length;i++)
			System.out.println((char) b1[i]);
		ByteArrayInputStream bais=new ByteArrayInputStream(b1);
		int c;
		System.out.println("Characters converted to Uppercase : ");
		for(int i=0;i<1;i++)
		{
			while((c=bais.read()) != -1)
			{
				System.out.println(Character.toUpperCase((char) c));
			}
			System.out.println();
			bais.reset();
		}
	}
}