/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.util.database;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author phelipp
 * @param <T>
 */
public interface DaoInterface<T extends ObjectDatabase>  {

    default public EntityManager factory() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LojaPU");
        return entityManagerFactory.createEntityManager();
    }

    default void salvar(T object) {
        EntityManager em = factory();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }

    List<T> select();

    T select(int id);
}
