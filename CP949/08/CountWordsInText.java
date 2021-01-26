/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class CountWordsInText {
    private String[] doc;
    private Map<String, Integer> wordsMap;
    private ArrayList<String> wordsList;
    
    public CountWordsInText(String[] doc) {
        this.doc = doc;
        wordsMap = new HashMap<String, Integer>();
        wordsList = new ArrayList<String>(); 
    }    
    public void countWords() {
        for (String sentence : doc) {  // doc �迭�� �� ���� ���� ó��
            String[] words = sentence.split("(\\,|\\!|\\;|\\.|\\s+)+");
            for (String word : words) {
                if (wordsMap.containsKey(word)) {
                    wordsMap.put(word, wordsMap.get(word) + 1);
                } 
                else {
                    wordsList.add(word); // ����Ʈ�� ���ο� �ܾ� �߰�
                    wordsMap.put(word, 1);
               }
            }
        }
    }    
    public void printWordsShownMoreThan(int n) {
        for (String word : wordsList) {
            int num = wordsMap.get(word);
            if (num >= n) { System.out.printf("%s : %d\n", word, num); }
        }    
    }
    
    public static void main(String[] args) {
        String doc[] = {
            "Hear the sledges with the bells",
            "Silver bells!",
            "What a world of merriment their melody foretells!",
            "How they tinkle, tinkle, tinkle,",
            "In the icy air of night!",
            "While the stars, that oversprinkle",
            "All the heavens, seem to twinkle",
            "With  a crystalline delight;",
            "Keeping time, time, time,",
            "In a sort if Runic rhyme,",
            "To the tintinabulation that so musically wells",
            "From the bells, bells, bells, bells,",
            "Bells, bells, bells,",
            "From the jingling and the tinkling of the bells."
        };
        
        CountWordsInText countWords = new CountWordsInText(doc);
        countWords.countWords();
        countWords.printWordsShownMoreThan(3);
    }
}  
