<%-- 
    Document   : index
    Created on : Mar 13, 2017, 9:29:39 AM
    Author     : User
--%>

<%@page import="java.util.List"%>
<%@page import="com.projectmanagement.entity.Status"%>
<%@page import="com.projectmanagement.daoimp.StatusDaoImp"%>
<%@page import="com.projectmanagement.dao.StatusDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="assests/js/jquery.min.js" type="text/javascript"></script>

        <link href="assests/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <style>
            .project-form
            {
                width:700px;

            }
            .message{
                width:300px;
                height:200px;
                background:#269abc;
                padding:20px;
                line-height: 200px;
                position:absolute;
                left:-300px;
                bottom:0px;
                display:none;
                -webkit-animation-name: show; /* Safari 4.0 - 8.0 */
                -webkit-animation-duration: 4s; /* Safari 4.0 - 8.0 */
                -webkit-animation-delay: 2s; /* Safari 4.0 - 8.0 */
            }
            @-webkit-keyframes show {
                0%   {left:-300px;}

                100% { left:0px;}
            }
        </style>
    </head>
    <body>



        <div class="project-form container-fluid" style="max-width:700px;">
            <h1>Project Management Application</h1>

            <form name="insert-project-form" method="post" action="addproject" style="max-width:700px">

                <div class="form-group">
                    <label for="name">Project Name:</label>
                    <input type="text" class="form-control" name="name" id="name" placeholder="Project Name">
                </div>
                <div class="form-group">
                    <label for="startDate">Start Date:</label>
                    <input type="date" class="form-control" name="startDate" id="startDate" placeholder="start Date">
                </div>

                <div class="form-group">
                    <label for="endDate">End Date:</label>
                    <input type="date" class="form-control" name="endDate" id="endDate" placeholder="end Date">
                </div>

                <label for="status">Status</label>


                <!--=================selecting the status details form status table ========================-->
                <select id="status" name="status" class="form-control">

                    <%

                        StatusDao sd = new StatusDaoImp();
                        List<Status> sList = sd.getAllStatus();
                        for (Status s : sList) {
                            

 
           %>
           <option value="<%=s.getStatusId()%>"><%=s.getStatusTitle()%></option>

                    <% }


          %>

                </select>

                <div class="from-group">
                    <label for="description">Description: </label>

                    <textarea class="form-control" name="description"  id="description" rows="3"></textarea>
                </div>

                <div class="form-group" style="margin-top:20px">
                    <button type="submit" id="add" class="btn btn-primary btn-sm">Add Project</button>
                </div>

            </form>


        </div>


          
          
        <!--===============code for displaying insert notification============-->
        <div class="message" id="message">
            <h6>Record Sucessfully Inserted</h1>

        </div>




        <script>

            //=====script for handeling the insert notification message================

            add.addEventListener("click", function () {

                message.style.display = "block";
            });


    </script>
    
    <script>
    $(document).ready(function(){

        alert("hello");

    });
        
   </script>

    </body>
</html>
