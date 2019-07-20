package dao;

import models.Key;
import models.Word;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class KeyDao {
    public Key findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Key.class, id);
    }

    public void save(Key key) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(key);
        tx1.commit();
        session.close();
    }

    public void update(Key key) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(key);
        tx1.commit();
        session.close();
    }

    public void delete(Key key) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(key);
        tx1.commit();
        session.close();
    }

    public Word findWordById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Word.class, id);
    }

    public List<Key> findAll() {
        List<Key> keys = (List<Key>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From key").list();
        return keys;
    }
}
