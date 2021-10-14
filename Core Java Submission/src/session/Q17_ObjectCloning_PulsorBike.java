package session;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Pulsor implements Cloneable,Serializable {
	private static final long serialVersionUID = 1L;
	String fuelType;
	int Tyres;
	String Color;

	public Pulsor(String fuelType, int Tyres, String Color) {
		this.fuelType = fuelType;
		this.Tyres = Tyres;
		this.Color = Color;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Q17_ObjectCloning_PulsorBike {

	public static void main(String[] args) throws CloneNotSupportedException, IOException {
		Pulsor Pulsor = new Pulsor("Petrol",2,"Blue");
		Pulsor Pulsor1 = (Pulsor) Pulsor.clone();
		Pulsor Pulsor2 = (Pulsor) Pulsor1.clone();
		Pulsor Pulsor3 = (Pulsor) Pulsor2.clone();
		Pulsor Pulsor4 = (Pulsor) Pulsor3.clone();
		Pulsor Pulsor5= (Pulsor) Pulsor2.clone();
		ArrayList<Pulsor> ar=new ArrayList<Pulsor>();
		ar.add(Pulsor1);
		ar.add(Pulsor2);
		ar.add(Pulsor3);
		ar.add(Pulsor4);
		ar.add(Pulsor5);
		
		ObjectInputStream objectinputstream = null;
		try {
			FileOutputStream fileOut = new FileOutputStream("resources/pulsor.txt");
			FileInputStream streamIn = new FileInputStream("resources/pulsor.txt");
			for(Object o:ar)
			{
				
		        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		        objectOut.writeObject(o);
		        objectOut.close();
		        System.out.println("The Object  was succesfully written to a file");
			}
			ArrayList<Pulsor> recordList=new ArrayList<Pulsor>();
			
			
		    objectinputstream = new ObjectInputStream(streamIn);
		    Pulsor readCase = null;
		    
		    	do {
			        readCase = (Pulsor) objectinputstream.readObject();
			        if(readCase != null){
			            recordList.add(readCase);
			        } 
			    } while (readCase != null);
			   for(int i=0;i<recordList.size();i++)
			    	System.out.println(recordList.get(i));
		   
		    	
		//    objectinputstream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
		    if(objectinputstream != null){
					objectinputstream .close();
		    } 
		}
	}

}
/*byte input[] = getInput();
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
f.close();*/
