public class Main {
    public static void main(String[] args) {

        WordFrequencyAnalyzerImp wordFrequencyAnalyzerImp = new WordFrequencyAnalyzerImp();
        String text = "The quick brown fox jumps over the lazy dog";



        try {
            String highestFrequency = wordFrequencyAnalyzerImp.calculateHighestFrequency(text);
            System.out.println(highestFrequency);

        }catch (NumberFormatException e) {
            e.getCause();
        }



    }
}