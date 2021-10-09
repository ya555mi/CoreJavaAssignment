import java.io.*;
import java.util.*;
import java.net.*;
 class URLReader{
   public static void main(String args[])throws IOException,FileNotFoundException
   {
	  TreeMap<Integer,String> treeMapAll=new TreeMap<Integer,String>(Collections.reverseOrder());
	     try{
	   Scanner scanner=new Scanner(System.in);
	   //Write URL inside the urls.txt file
	  BufferedWriter bufferedWriter=new BufferedWriter(new PrintWriter("urls.txt"));
	  bufferedWriter.write("http://help.websiteos.com/websiteos/example_of_a_simple_html_page.htm");
	  bufferedWriter.newLine();
	  bufferedWriter.write("http://help.websiteos.com/websiteos/example_of_a_simple_html_page.htm");
	  bufferedWriter.flush();
	  bufferedWriter.close();
  	  BufferedReader urlBufferedReader=new BufferedReader(new FileReader("urls.txt"));
      String urlReader=urlBufferedReader.readLine();
	  while(urlReader!=null){
      // urlReader=br.readLine();
	  //create words.txt
	  BufferedWriter bufferedWriter1=new BufferedWriter(new PrintWriter("words.txt"));
	  
	  System.out.println("Enter number :How many words you want to find inside the URL");
	  int  numberOfWords=scanner.nextInt();
	  while(numberOfWords!=0)
	  {
	  System.out.println("Enter that word which u want to find inside the URLs");
	  bufferedWriter1.write(scanner.next());
	  bufferedWriter1.newLine();
	  numberOfWords--;
	  }
	  bufferedWriter1.flush();
	  bufferedWriter1.close();
	  //Read Words.txt file
	  BufferedReader wordBufferedReader=new BufferedReader(new FileReader("words.txt"));	
      StringBuffer stringBuffer = new StringBuffer();
      URL u=new URL(urlReader);
      URLConnection ul=u.openConnection();
      InputStream fo1=ul.getInputStream();
      int i=fo1.read();
      while(i!=-1)
       {
      stringBuffer.append((char)i);
       i=fo1.read();
       }
	  //Store url inside the String
      String urlResult = stringBuffer.toString();
      urlResult = urlResult.replaceAll("\\<[^>]*>", "");
      urlResult = urlResult.replaceAll("[^a-zA-Z0-9]"," ");
	  String oldString[]=urlResult.split(" ");
	  String wordString=wordBufferedReader.readLine();
	  int wordCount=0;
	  TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>(Collections.reverseOrder());
	  while(wordString!=null)
	  {
	  wordCount=0;
	  for(String urlString1:oldString)
	  {
	  if(wordString.equals(urlString1))
	  {
		wordCount++;
	  }
	  } 
	  treeMap.put(wordCount,wordString);   
	  wordString=wordBufferedReader.readLine();	
	  }
      for(Map.Entry m:treeMap.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
	  treeMapAll.putAll(treeMap);
	  urlReader=urlBufferedReader.readLine();
	  }
	  //display all values
          System.out.println("All values");      
	    for(Map.Entry m:treeMapAll.entrySet())  
      {   
          System.out.println(m.getKey()+" "+m.getValue());      
      } 
	  }
	  catch(InputMismatchException inputMismatchException) {
		  System.out.println("Invalid value character not allowed here");
	  }
	  }
      }