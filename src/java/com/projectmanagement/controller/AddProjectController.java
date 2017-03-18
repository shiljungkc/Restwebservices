/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectmanagement.controller;

import com.projectmanagement.daoimp.ProjectDaoImp;
import com.projectmanagement.entity.Project;
import com.projectmanagement.entity.Status;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "addProjectController", urlPatterns = "/addproject")
public class AddProjectController extends HttpServlet {

    private PrintWriter out;
    private Project pp;
    private ProjectDaoImp pdi;
    SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String projectName;
        Date startDate;
        Date endDate;
        String desc;
        int status;

        try {
            out = resp.getWriter();

            //=============data gathering logic =====================
            projectName = req.getParameter("name");
            startDate = sdf.parse(req.getParameter("startDate"));
            endDate = sdf.parse(req.getParameter("endDate"));
            desc = req.getParameter("description");
            status=Integer.parseInt(req.getParameter("status"));
            
            
            //====setting the status of the status objet ================
            
            
            
//                     status = (req.getParameter("status") == null ? false : true);
            out.println(status);

            //===============setting the dependencies======================
            
            

            pp=new Project(status, projectName, desc, startDate, endDate,status);
            //================inserting the data into database =========================
            pdi = new ProjectDaoImp();
           if( pdi.insertProject(pp))
           {
               
               
               req.getRequestDispatcher("sucess-message.jsp").forward(req, resp);
               
           }
            
            
        } catch (Exception ex) {
            System.out.println(""+ex.toString());
            out.println(ex.toString());
        }

    }

}
