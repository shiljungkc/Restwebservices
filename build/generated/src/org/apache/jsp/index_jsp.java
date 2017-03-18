package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.projectmanagement.entity.Status;
import com.projectmanagement.daoimp.StatusDaoImp;
import com.projectmanagement.dao.StatusDao;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"assests/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"assests/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            .project-form\n");
      out.write("            {\n");
      out.write("                width:700px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .message{\n");
      out.write("                width:300px;\n");
      out.write("                height:200px;\n");
      out.write("                background:#269abc;\n");
      out.write("                padding:20px;\n");
      out.write("                line-height: 200px;\n");
      out.write("                position:absolute;\n");
      out.write("                left:-300px;\n");
      out.write("                bottom:0px;\n");
      out.write("                display:none;\n");
      out.write("                -webkit-animation-name: show; /* Safari 4.0 - 8.0 */\n");
      out.write("                -webkit-animation-duration: 4s; /* Safari 4.0 - 8.0 */\n");
      out.write("                -webkit-animation-delay: 2s; /* Safari 4.0 - 8.0 */\n");
      out.write("            }\n");
      out.write("            @-webkit-keyframes show {\n");
      out.write("                0%   {left:-300px;}\n");
      out.write("\n");
      out.write("                100% { left:0px;}\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"project-form container-fluid\" style=\"max-width:700px;\">\n");
      out.write("            <h1>Project Management Application</h1>\n");
      out.write("\n");
      out.write("            <form name=\"insert-project-form\" method=\"post\" action=\"addproject\" style=\"max-width:700px\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"name\">Project Name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"Project Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"startDate\">Start Date:</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" name=\"startDate\" id=\"startDate\" placeholder=\"start Date\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"endDate\">End Date:</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" name=\"endDate\" id=\"endDate\" placeholder=\"end Date\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <label for=\"status\">Status</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--=================selecting the status details form status table ========================-->\n");
      out.write("                <select id=\"status\" name=\"status\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                    ");


                        StatusDao sd = new StatusDaoImp();
                        List<Status> sList = sd.getAllStatus();
                        for (Status s : sList) {
                            

 
           
      out.write("\n");
      out.write("           <option value=\"");
      out.print(s.getStatusId());
      out.write('"');
      out.write('>');
      out.print(s.getStatusTitle());
      out.write("</option>\n");
      out.write("\n");
      out.write("                    ");
 }


          
      out.write("\n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <div class=\"from-group\">\n");
      out.write("                    <label for=\"description\">Description: </label>\n");
      out.write("\n");
      out.write("                    <textarea class=\"form-control\" name=\"description\"  id=\"description\" rows=\"3\"></textarea>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\" style=\"margin-top:20px\">\n");
      out.write("                    <button type=\"submit\" id=\"add\" class=\"btn btn-primary btn-sm\">Add Project</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        <!--===============code for displaying insert notification============-->\n");
      out.write("        <div class=\"message\" id=\"message\">\n");
      out.write("            <h6>Record Sucessfully Inserted</h1>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            //=====script for handeling the insert notification message================\n");
      out.write("\n");
      out.write("            add.addEventListener(\"click\", function () {\n");
      out.write("\n");
      out.write("                message.style.display = \"block\";\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("\n");
      out.write("        alert(\"hello\");\n");
      out.write("\n");
      out.write("    });\n");
      out.write("        \n");
      out.write("   </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
