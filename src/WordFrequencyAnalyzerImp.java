import java.util.*;

public class WordFrequencyAnalyzerImp {

    protected String calculateHighestFrequency(String text) {
        String[] words = text.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {

            map.put(word, map.getOrDefault(word, 0) + 1);
            System.out.println(word + " " +  map.get(word));
        }

        int highestFrequency = 0;
        String highestWord = "";
        for (Map.Entry<String, Integer> word : map.entrySet()) {
            Integer count = map.get(word.getKey());
            if (count > highestFrequency) {
                highestFrequency = count;
                highestWord = String.valueOf(word);
            }
        }


        return highestWord;

        // return Integer.parseInt(map.toString());
    }
    private int calculateFrequency(String text,String word) {
        return 0;
    }

    private List<WordFrequencyImp> calculateMostFrequentNWords(String text, int in) {
        return null;
    }
}
