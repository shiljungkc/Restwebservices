/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectmanagement.dao;


import com.projectmanagement.entity.Project;
import java.util.List;

/**
 *
 * @author User
 */
public interface ProjectDao {
    
    Boolean insertProject(Project p);
    List<Project> getAllProjects();
    Project getById(Integer id);
    Project getByName(String projectName);
    Boolean deleteById(Integer id);
    Boolean deleteByName(String projectName);
    
}
