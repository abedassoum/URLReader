public class Main {
    public static void main(String[] args){
        tag t = new tag();

        int count = WordCounter.countWords("https://www.google.com", "meta");
        System.out.println(count);
    }

}

