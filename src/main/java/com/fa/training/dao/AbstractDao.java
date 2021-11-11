package com.fa.training.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractDao<T> {

    private Class<T> entityClass;
    private LocalSessionFactoryBean sessionFactory;

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Autowired
    public AbstractDao(LocalSessionFactoryBean sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * Insert a entity to database
     * @param entity that will be insert into database
     * @return id of entity that success insert to database
     */
    public Serializable create(T entity) {

        Session session = sessionFactory.getObject().openSession();
        Transaction transaction = session.beginTransaction();
        Serializable id = session.save(entity);
        transaction.commit();

        return id;
    }

    /**
     * Get a row from database
     * @param id of row that will be get
     * @return entity
     */
    public T readOne(Serializable id) {

        Session session = sessionFactory.getObject().openSession();
        Transaction transaction = session.beginTransaction();
        T readEntity = session.get(entityClass, id);
        transaction.commit();

        return readEntity;
    }

    /**
     * Read all row of table
     * @return list of entity
     */
    public List<T> readAll() {

        Session session = sessionFactory.getObject().openSession();
        Transaction transaction = session.beginTransaction();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(entityClass);
        Root<T> root = query.from(entityClass);
        query.select(root);
        Query<T> q = session.createQuery(query);
        List<T> entityList = q.getResultList();
        transaction.commit();

        return entityList;
    }

    /**
     * Update a entity to database
     * @param entity that will be updated
     */
    public void update (T entity) {

        Session session = sessionFactory.getObject().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
    }

    /**
     * Delete a row at database
     * @param id of row that will be deleted
     */
    public void delete (Serializable id) {

        Session session = sessionFactory.getObject().openSession();
        Transaction transaction = session.beginTransaction();
        T deletedEntity = session.get(entityClass, id);
        session.delete(deletedEntity);
        transaction.commit();
    }

    /**
     * Get rows of database based on condition input contain a string or substring
     * @param fieldName of entity
     * @param value that will be compared
     * @return list of entity
     */
    public List<T> likeOperator(String fieldName, String value) {

        Session session = sessionFactory.getObject().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(entityClass);
        Root<T> root = query.from(entityClass);

        query.select(root);
        query.where(criteriaBuilder.like(root.get(fieldName), "%" + value + "%"));

        Query<T> q = session.createQuery(query);

        List<T> entityList = q.getResultList();

        return entityList;
    }

    /**
     * Get rows of database based on condition input is equal
     * @param <V> type of value that will be compared
     * @param field of entity
     * @param v value that will be compared
     * @return list of entity
     */
    public <V> List<T> equalOperator(String field, V v) {

        Session session = sessionFactory.getObject().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(this.entityClass);
        Root<T> root = query.from(this.entityClass);

        query.select(root);
        query.where(criteriaBuilder.equal(root.get(field), v));

        Query<T> q = session.createQuery(query);

        List<T> orderList = q.getResultList();

        return orderList;
    }

    /**
     * Get rows of database based on condition input is greater than or equal
     * @param <Y> type of value that will be compared
     * @param field of entity
     * @param value that will be compared
     * @return list of entity
     */
    public <Y extends Comparable<? super Y>> List<T> greaterThanOperator(String field, Y value) {

        Session session = sessionFactory.getObject().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(this.entityClass);
        Root<T> root = query.from(this.entityClass);

        query.select(root);
        query.where(criteriaBuilder.greaterThanOrEqualTo(root.get(field), value));

        Query<T> q = session.createQuery(query);

        List<T> orderList = q.getResultList();

        return orderList;
    }

    /**
     * Get rows of database based on condition input is less than or equal
     * @param <Y> type of value that will be compared
     * @param field of entity
     * @param value that will be compared
     * @return list of entity
     */
    public <Y extends Comparable<? super Y>> List<T> lessThanOperator(String field, Y value) {

        Session session = sessionFactory.getObject().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(this.entityClass);
        Root<T> root = query.from(this.entityClass);

        query.select(root);
        query.where(criteriaBuilder.lessThanOrEqualTo(root.get(field), value));

        Query<T> q = session.createQuery(query);

        List<T> orderList = q.getResultList();

        return orderList;
    }

}
