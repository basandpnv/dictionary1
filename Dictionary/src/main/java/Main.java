import models.Dictionary;
import services.DictionaryService;

public class Main {
    public static void main(String[] args) {
        DictionaryService dictionaryService = new DictionaryService();
        Dictionary dictionary = new Dictionary("English-Russian");
        dictionaryService.saveDictionary(dictionary);
    }
}
