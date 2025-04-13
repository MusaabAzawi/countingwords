import java.util.*;

public class WordFrequencyAnalyzerImp {

    private String word;

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
    protected int calculateFrequencyForWord(String text,String word) {

        String[] words = text.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
           map.put(w, map.getOrDefault(w, 0) + 1);
        }
        return map.getOrDefault(word, 0);
    }

    private List<WordFrequencyImp> calculateMostFrequentNWords(String text, int n) {

//        String[] words = text.toLowerCase().split(" ");
//        Map<String, Integer> map = new HashMap<>();
//        for (String item : words {
//            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
//        }
        return null;
    }
}
