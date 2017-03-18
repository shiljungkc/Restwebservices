/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectmanagement.api;

import com.projectmanagement.dao.ProjectDao;
import com.projectmanagement.daoimp.ProjectDaoImp;
import com.projectmanagement.entity.Project;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class ProjectManagementApi
{
   //====dependencies===================
    
    private ProjectDao pd=new ProjectDaoImp();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Project> dispaly()
    {
      return  pd.getAllProjects();
       
    }
}
