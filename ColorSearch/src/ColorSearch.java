import java.util.Scanner;

import java.util.ArrayList;

public class ColorSearch 
{

public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		
		ColorSearch searchForColor = new ColorSearch();
		ArrayList<String> ColorsArray = new ArrayList<String>();
		
		String color;
		String colorSearch;
		
		System.out.println("Please enter a color name, or type in 'Q' to quit: ");
		
		while(scan.hasNext())
		{
			color = scan.nextLine();
			if(color.compareTo("Q") == 0)
			{
				break;
			}
			else
			{
				ColorsArray.add(color);
			}
			
			System.out.println("Please enter a color name or type 'Q' to quit: ");
			
		}
		System.out.println();
		System.out.println("Enter a color to search for or type 'Q' to quit: ");
		
		while(scan.hasNext())
		{
			colorSearch = scan.nextLine();
			if(colorSearch.compareTo("Q") == 0)
			{
				break;
			}
			else
			{
				searchForColor.colorSearch(ColorsArray, colorSearch);
			}
			System.out.println("Enter a color to search for or type 'Q' to quit: ");
			
		}
		
	}
	public void colorSearch(ArrayList<String> allColors, String colorSearch)
	{
		
		boolean colorFound = true;
		for (String color : allColors)
		{
			if (colorSearch.compareTo(color) == 0)
			{
				colorFound = true;
				break;
			}
		}
		if (colorFound)
		{
			System.out.println("The color " + colorSearch + " was found after " + (allColors.indexOf(colorSearch) + 1) + " searches.");
			System.out.println();
		}
		else if (colorFound = false)
		{
			System.out.println("The color " + colorSearch + " was not found after " + allColors.size() + " searches.");
			System.out.println();
		}
	}
}

