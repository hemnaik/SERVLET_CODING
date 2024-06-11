import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class servlet1 extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
         PrintWriter p=response.getWriter();
        
         HttpSession s1=request.getSession();
         s1.setAttribute("name","HEM NAIK");
         s1.setAttribute("language","ADVANCE JAVA");
         
         p.println("<h1 style=color:red;><a href='servlet2'>SESSION TRACKING</a></h1>");
    }
}