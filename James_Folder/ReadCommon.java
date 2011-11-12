import java.io.*;
import java.util.*;

public class ReadCommon {
private final File commonFile;
String val;
List<String> arr = new ArrayList<String>();
  
  public ReadCommon(String test) throws FileNotFoundException
  	{
  	commonFile = new File(test);
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

  protected void processLine(String aLine)
  	{
  	Scanner scanner = new Scanner(aLine);
  	while (scanner.hasNext())
    		{
    		val = scanner.next();
    		arr.add(val);
    		}
    	}
  public boolean commonWordCheck(String aWord)
  	{
  	if (arr.contains(aWord))
    		{
    		return true;
    		}
    	else
    		{
    		return false;
    		}
    	}  
} 
