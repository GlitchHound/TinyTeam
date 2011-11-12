package uk.co.devxs.tinyteam.pdf;
/** Extract the text from a PDF document **/

import org.apache.pdfbox.util.PDFTextStripper;
import java.io.*;


public class PDFTextExtractor
{
	private PDFTextStripper document;
	   
	public PDFTextExtractor(String filename)
	{  
		File pdfFile;
		
		try{
			document = new PDFTextStripper();
			pdfFile = new File(filename);
		} catch(IOException e) {};
	}
}