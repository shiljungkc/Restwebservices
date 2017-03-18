/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectmanagement.daoimp;

import com.projectmanagement.dao.ProjectDao;
import com.projectmanagement.entity.Project;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


/**
 *
 * @author User
 */
public class ProjectDaoImp implements ProjectDao{
    
    //======gathering the dependecny==============
    
    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("projectmangement_JPA_application_using_JAXRSPU");
    private EntityManager em=emf.createEntityManager();
    private EntityTransaction trans=em.getTransaction();
    
    
    @Override
    public Boolean insertProject(Project p) {
        
        
        if(!trans.isActive())
        {
        trans.begin();
        }
        
        em.persist(p);
        trans.commit();
        
        return true;
        
        
        
    }

    @Override
    public List<Project> getAllProjects() {
        
       return em.createNamedQuery("Project.findAll").getResultList();
    }

    @Override
    public Project getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Project getByName(String projectName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteByName(String projectName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
