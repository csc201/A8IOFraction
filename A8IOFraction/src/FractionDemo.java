import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Fraction frac1 = new Fraction(1,2);
		//int x=5;
		
		try {
			FileOutputStream outFile = new FileOutputStream("SerialF.dat");
			ObjectOutputStream objOutput = new ObjectOutputStream(outFile);
			objOutput.writeObject(frac1);
			objOutput.close();
			outFile.close();
			//objOutput.writeInt(x);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		FileInputStream inFile;
		try {
			inFile = new FileInputStream("SerialF.dat");
			ObjectInputStream objInput = new ObjectInputStream(inFile);
			Object obj = objInput.readObject();
			objInput.close();
			inFile.close();
			System.out.println((Fraction)obj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No Fraction class found!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
