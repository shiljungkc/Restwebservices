/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectmanagement.dao;

import com.projectmanagement.entity.Status;
import java.util.List;

/**
 *
 * @author User
 */
public interface StatusDao {
   Boolean insertStatus(Status s);
   List<Status> getAllStatus();
   Status getById(Integer id);
   
   
    
    
}
