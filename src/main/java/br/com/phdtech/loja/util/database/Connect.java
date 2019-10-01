/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.util.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author phelipp
 */
public class Connect {
    private static Connect instance;
    private EntityManager entityManager;
    private Connect(){
        
    }
    public EntityManager factory(){
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("LojaPU");
        return entityManagerFactory.createEntityManager();
    }
    public static Connect getInstance() {
        
        return (instance==null)?new Connect():instance;
    }
    
    
}
