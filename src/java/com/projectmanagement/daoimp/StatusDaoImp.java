/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectmanagement.daoimp;

import com.projectmanagement.dao.StatusDao;
import com.projectmanagement.entity.Status;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author User
 */
public class StatusDaoImp implements StatusDao {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction trans;

    public StatusDaoImp() {
        emf=Persistence.createEntityManagerFactory("projectmangement_JPA_application_using_JAXRSPU");
        em=emf.createEntityManager();
        trans=em.getTransaction();
    }
    
    

    @Override
    public Boolean insertStatus(Status s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Status> getAllStatus() {
        Query q=em.createQuery("select s from Status s");
 
        return q.getResultList();
        
    }

    @Override
    public Status getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
