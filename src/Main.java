import java.util.List;

public class Main {
    public static void main(String[] args) {

        WordFrequencyAnalyzerImp wordFrequencyAnalyzerImp = new WordFrequencyAnalyzerImp();
        String text = "The sun shines over the lake";
        String word = "the";
        int frequency = 3;
        try {
//            String currentWord = String.valueOf(wordFrequencyAnalyzerImp.calculateFrequencyForWord(text,word));
//            System.out.println(currentWord);
//            String highestFrequency = wordFrequencyAnalyzerImp.calculateHighestFrequency(text);
//            System.out.println(highestFrequency);
            List<WordFrequencyImp> mostFrequentWords = wordFrequencyAnalyzerImp.calculateMostFrequentNWords(text, frequency);
            for (WordFrequencyImp wordFreq : mostFrequentWords) {
                System.out.println(wordFreq.getWord() + ": " + wordFreq.getFrequency());
            }
        }catch (NumberFormatException e) {
            e.getCause();
        }



    }
}