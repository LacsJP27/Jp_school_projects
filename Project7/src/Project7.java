import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/** This program will take a file name, read in data in the file, and fine the line that occurred
 * most frequently (not considering case).
 * 
 * @author Deborah A. Trytten and 
 * @version 1.0
 *
 */
public class Project7
{
	/** Read in a file name from the user. The file should contain the names of movies, one
	 * to a line. These names will be converted to lower case, sorted, and the most common movie
	 * name found and reported to the user.
	 * 
	 * @param args There are no command line arguments.
	 * @throws FileNotFoundException If the file name the user enters is not stored in the appropriate
	 * project directory.
	 */
	//final private static String FILENAME = "movie-test1.txt";
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a file name:");
		String filename = keyboard.nextLine();
		String[] movieTitles = readFile(filename);
		lowercase(movieTitles);
		String mostFreq = findMostFrequent(movieTitles);
		System.out.println("Most popular movie: " + mostFreq);
		keyboard.close();
	}

	/** Read the contents of a file into an array. The size of the array will be determined by the
	 * number of lines in the file.
	 * 
	 * @param filename The name of the file that contains the data.
	 * @return An array that contains the contents of the file, one line to an array element.
	 * @throws FileNotFoundException If the given file name does not exist in the project directory.
	 */
	public static String[] readFile(String filename) throws FileNotFoundException
	{
		int numLines = 0;
		Scanner file = new Scanner(new File(filename));
		while(file.hasNextLine()) 
		{
			file.nextLine();
			++numLines;
		}
		file.close();
		file = new Scanner(new File(filename));
		
		String[] movies = new String[numLines];
		for(int i = 0; i < movies.length; ++i)
		{
			movies[i] = file.nextLine();
		}
		
		return movies; // A stub--remember to change this
	}

	/** Convert each line in an array of Strings to lower case.
	 * 
	 * @param array The array to be converted. The contents of this array, but not its location in the heap
	 * will be modified by this method.
	 */
	public static void lowercase(String[] array)
	{
		// A Stub
		for(int i = 0; i < array.length; ++i)
		{
			array[i] = array[i].toLowerCase();
		}
	}

	/** Find the line in the array that occurs most frequently. The array contents will be modified by this method.
	 * 
	 * @param array An array that contains movie titles.
	 * @return The most commonly occurring line in the array.
	 */
	public static String findMostFrequent(String[] array)
	{
		if(array.length == 0)
		{
			return "";
		}
		Arrays.sort(array);
		String currentItem = array[0];
		int currentFreq = 1;
		String maxItem = currentItem;
		int maxFreq = currentFreq;
		
		for(int i = 1; i < array.length; ++i)
		{
			if(array[i].equals(currentItem))
			{
				++currentFreq;
				if(currentFreq > maxFreq)
				{
					maxFreq = currentFreq;
					maxItem = array[i];
				}
			}
			else
			{
				{
					currentFreq = 1;
				}
				
			}
			
		}
		return maxItem; // A stub--remember to change this
	}
}