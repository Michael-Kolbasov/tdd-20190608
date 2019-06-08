package com.epam.tdd.dao;

import com.epam.tdd.model.Smurf;
import com.epam.tdd.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SmurfDao {
    private static final SmurfDao instance = new SmurfDao();

    public static SmurfDao getInstance() {
        return instance;
    }

    public Smurf findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Smurf.class, id);
    }

    public void save(Smurf smurf) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(smurf);
        tx1.commit();
        session.close();
    }

    public void update(Smurf smurf) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(smurf);
        tx1.commit();
        session.close();
    }

    public void delete(Smurf smurf) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(smurf);
        tx1.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    public List<Smurf> findAll() {
        return (List<Smurf>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Smurfs").list();
    }
}
