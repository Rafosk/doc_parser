package Doc_parser.Doc_parser;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.docx4j.openpackaging.exceptions.Docx4JException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Docx4JException
    {
    	  // String to be scanned to find the pattern.
        String line = "Sofern in der [[SREW|Abruferweiterung]] als [[SREW.VERSANDSONDE.RABWICKLUNG|Versandsonderabwicklung]] konfiguriert, stellt";
        //String pattern = "(.*){2}(\\d)(.*)";
        //String pattern = ".*(\\[[A-Z]{2,100}.[A-Z]{2,100}\\|).*";
        String pattern = "(\\[[A-Z]*(\\.?[A-Z]*)*\\|)";
        String pattern2 = "\\[SREW\\|";
        
        System.out.println(line.replaceAll(pattern, "<<$1>>"));
       // System.out.println(line.replaceAll(pattern2, "<...>"));
        
        List<String> domeny = new LinkedList<String>();
        
        domeny.add("https://www.google.com");
        domeny.add("http://coreyms.com");
        domeny.add("https://youtube.com");
        domeny.add("https://www.nasa.gov");
        
        System.out.println(domeny.get(0).replaceAll("(http)s?://(www\\.)?([a-z.]+)", ""));
        
        String pattern3 = "https?://(www\\.)?([a-z.]+)";
        Pattern r2 = Pattern.compile(pattern3);
        for (String string : domeny) {
        	Matcher m2 = r2.matcher(string);
        	 if (m2.find( )) {
        	           System.out.println("Found value: " + m2.group(0) );
        	           System.out.println("Found value: " + m2.group(2) );
        	   }else {
		}
        }
        
        
        
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        
        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
        //   System.out.println("Found value: " + m.group(0) );
          // System.out.println("Found value: " + m.group(1) );
        }else {
           System.out.println("NO MATCH");
        }
    }
    
    
    
}
