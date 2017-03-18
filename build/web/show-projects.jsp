<%-- 
    Document   : show-projects
    Created on : Mar 14, 2017, 2:45:58 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <script src="assests/js/jquery.min.js" type="text/javascript"></script>
        <link href="assests/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <style>
            th{
                background:#31b0d5;
            }
            #result
            {
                
            }
        </style>
    </head>
    <body class="container-fluid">
        <h1>The Project Listing </h1>
        <div class="row">
        <div id="result" class="col-lg-12 col-md-4 col-sm-2">

            the result from ajax call from API 
        </div>
        </div>
            <script>
            $(document).ready(function (){       
                $.get("projectmanagementapi", function(data){
                    
                    content="";
                    content+="<table border=1 class='table table-responsive table-hover'></tr>";
                    content+="<th>Project ID: </th>";
                    content+="<th>Project Name: </th>";
                    content+="<th>Project Desc: </th>";
                    content+="<th>Start Date: </th>";
                    content+="<th>End Date: </th>";
                    content+="<th>Status : </th></tr>";
                    $.each(data,function(i,o){
                        content+="<tr><td>"+o.projectId+"</td>";
                        content+="<td>"+o.projectName+"</td>";
                        content+="<td>"+o.description+"</td>";
                        content+="<td>"+o.startDate+"</td>";
                        content+="<td>"+o.endDate+"</td>";
                        content+="<td>"+o.statusId+"</td>";
                        
                        
                       });
                       
                       content+="</table>";
                       $("#result").html(content);
                       
                 });



            });


        </script>
            
            
            
       

            


    </body>
</html>
