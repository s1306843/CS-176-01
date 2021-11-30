import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputFiles 
{

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		String filePath = " ";
		PrintWriter outputFile;
		boolean ifValidFile = false;
		
		while(!ifValidFile)
		{
			
			System.out.println("Please enter the filePath to open the input file for example C:\\Downloads\\lines.txt :");
			filePath = in.nextLine();
			
			try
			{
				
				outputFile = new PrintWriter("C:\\Users\\conno\\Downloads\\outlines.txt");
				
				File inputFile = new File(filePath);
				
				Scanner file = new Scanner(inputFile);
				
				System.out.println("FilePath is valid. Please enter the text you want to save. Terminate program to save file.");
				ifValidFile = true;
				
				while (in.hasNextLine()) 
				{
					String what = in.nextLine();
					outputFile.println(what);
				}
				
				in.close();
				outputFile.close();
				
			}
			
			catch (FileNotFoundException exception)
			{
				
				System.out.println("File is not found, please try again.");
				
			}
			
		}

	}

}