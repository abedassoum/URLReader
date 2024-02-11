import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URLReader{
   public static void main(String[] args) throws Exception {

   String url = "https://www.tv2.dk";

   URL u = new URL(url);

//use bufferedreader to read the content
    BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));
    String inputLine;
    while ((inputLine = in.readLine()) != null)
        System.out.println(inputLine);
    in.close();




   }

}