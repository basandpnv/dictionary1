package dao;

import models.Word;
import models.Word;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class WordDao {
    public Word findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Word.class, id);
    }

    public void save(Word word) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(word);
        tx1.commit();
        session.close();
    }

    public void update(Word word) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(word);
        tx1.commit();
        session.close();
    }

    public void delete(Word word) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(word);
        tx1.commit();
        session.close();
    }

    public List<Word> findAll() {
        List<Word> words = (List<Word>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From word").list();
        return words;
    }
}
