import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class servlet2 extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
         PrintWriter p=response.getWriter();
        
         HttpSession s1=request.getSession(false);
         String name=(String)s1.getAttribute("name");
         String language=(String)s1.getAttribute("language");
         p.println("<h1 style=color:blue;>NAME="+name+"</h1>"); 
         p.println("<h1 style=color:blue;>LANGUAGE="+language+"</h1>");
    }
}