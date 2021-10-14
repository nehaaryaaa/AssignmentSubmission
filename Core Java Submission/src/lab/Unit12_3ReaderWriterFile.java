package lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit12_3ReaderWriterFile {

	public static void main(String[] args) throws IOException {
		int n,i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw=new FileWriter("resources/strings.txt");
		String s="";
		System.out.println("Enter string - type end to stop : ");
		while(!s.equals("end"))
		{
			s=br.readLine();
			char buffer[] = s.toCharArray();
			fw.write(buffer);
			fw.write('\n');
		}
		fw.close();
		br.close();
		FileReader fr=new FileReader("resources/strings.txt");
		BufferedReader brr=new BufferedReader(fr);
		int max=0;
		String out="";
		while((out=brr.readLine()) != null)
		{
			if(!out.equals("end"))
				System.out.println("String Read From File is : "+out);
		}
		
		fr.close();
		brr.close();
	}
}