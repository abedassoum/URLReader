import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class WordCounter {
public static int countWords(String url, String word) {
        int count = 0;
        try {
            Document doc = Jsoup.connect(url).get();
            String text = doc.text().toLowerCase(); // Convert all text to lowercase for case-insensitive matching
            String[] words = text.split("\\s+"); // Split text into words using whitespace as delimiter
            for (String w : words) {
                if (w.equals(word.toLowerCase())) { // Check if the word matches the given word
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    return count;

}
    public static void main(String[] args){
        String url = "https://www.example.com"; // Your URL here
        String word = "example"; // Word to count
        int count = countWords(url, word);
        System.out.println("The word '" + word + "' appears " + count + " times in the URL: " + url);
    }
}
