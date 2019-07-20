package services;

import dao.DictionaryDao;
import models.Dictionary;
import models.Key;

import java.util.List;

public class DictionaryService {
    private DictionaryDao dictionariesDao = new DictionaryDao();

    public DictionaryService() {
    }

    public Dictionary findDictionary(int id) {
        return dictionariesDao.findById(id);
    }

    public void saveDictionary(Dictionary dictionary) {
        dictionariesDao.save(dictionary);
    }

    public void deleteDictionary(Dictionary dictionary) {
        dictionariesDao.delete(dictionary);
    }

    public void updateDictionary(Dictionary dictionary) {
        dictionariesDao.update(dictionary);
    }

    public List<Dictionary> findAllDictionaries() {
        return dictionariesDao.findAll();
    }

    public Key findKeyById(int id) {
        return dictionariesDao.findKeyById(id);
    }

}
