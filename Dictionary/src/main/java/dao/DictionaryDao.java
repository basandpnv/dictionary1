package dao;

import models.Dictionary;
import models.Dictionary;
import models.Key;
import models.Word;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class DictionaryDao {
    public Dictionary findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Dictionary.class, id);
    }

    public void save(Dictionary dictionary) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(dictionary);
        tx1.commit();
        session.close();
    }

    public void update(Dictionary dictionary) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(dictionary);
        tx1.commit();
        session.close();
    }

    public void delete(Dictionary dictionary) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(dictionary);
        tx1.commit();
        session.close();
    }

    public Key findKeyById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Key.class, id);
    }

    public List<Dictionary> findAll() {
        List<Dictionary> dictionarys = (List<Dictionary>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From dictionary").list();
        return dictionarys;
    }
}
