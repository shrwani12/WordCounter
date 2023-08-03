import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
 public class WordCounter  
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fin=new FileInputStream("Test.txt");
        Scanner fileInput=new Scanner(fin);
        int total=0;
      
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        while (fileInput.hasNext())
        {
            String nextWord=fileInput.next();
            
            if(map.containsKey(nextWord))
            {
                map.put(nextWord,map.get(nextWord)+1);
                total++;
            }
            else
            {
                map.put(nextWord,1);
                total++;
            }
        }
        fin.close();
        fileInput.close();
        for (Map.Entry<String,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("Total Nmber of words="+total);
		
	}
}
