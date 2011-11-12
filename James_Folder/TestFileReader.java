import java.io.*;
import java.util.*;

public class TextFileReader {
private final File testFile;
String val;
List<String> arr = new ArrayList<String>();
  
  public TextFileReader(String pdf) throws FileNotFoundException
  	{
  	testFile = new File(pdf);
  	processLineByLine();
  	}
  
  public final void processLineByLine() throws FileNotFoundException
  	{
  	Scanner scanner = new Scanner(new FileReader(commonFile));
  	try
  		{
  		while (scanner.hasNextLine())
  			{
  			processLine(scanner.nextLine());
  			}
  		}
  	finally {
  		scanner.close();
  		}
  	}

  public void processLine(String aLine){
    //use a second Scanner to parse the content of each line 
    Scanner scanner = new Scanner(aLine);
    List<String> arr = new ArrayList<String>();
    String val;
    while (scanner.hasNext())
    	{
    	val = scanner.next();
    	arr.add(val);
    	}
  }
  public String[]   read(){
  return arr.toArray();	  
  }
} 
